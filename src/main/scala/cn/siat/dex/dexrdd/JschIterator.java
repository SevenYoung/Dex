package cn.siat.dex.dexrdd;

import com.jcraft.jsch.*;

import java.io.*;
import java.util.Iterator;

import static cn.siat.dex.dexrdd.ScpFrom.*;


/**
 * Created by SevenYoung on 16-1-17.
 */
public class JschIterator implements Iterator<String> {
    private String remoteUser = null;
    private String remotePath = null;
    private String remoteHost = null;
//    private String localPath = null;
    private OutputStream out = null;
    private InputStream in = null;
    private BufferedReader br = null;
    private byte[] buf = new byte[1024];
    private long filesize = 0;
    private boolean isHasNext = true;
    private Session session = null;
    private String file = null;
//    private String tmp = "tmp";



    public JschIterator(String s) {
        String[] arg = s.split(" ");
        remoteUser = arg[0].substring(0, arg[0].indexOf('@'));
        arg[0]=arg[0].substring(arg[0].indexOf('@')+1);
        remoteHost=arg[0].substring(0, arg[0].indexOf(':'));
        remotePath=arg[0].substring(arg[0].indexOf(':')+1);
//        localPath = arg[1];
        try{
            JSch jsch = new JSch();
            session = jsch.getSession(remoteUser, remoteHost, 22);

            // username and password will be given via UserInfo interface.
//            UserInfo ui = new MyUserInfo();
//            session.setUserInfo(ui);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.setPassword("linux123");
            session.connect();

            // exec 'scp -f rfile' remotely
            String command = "scp -f " + remotePath;
            Channel channel = session.openChannel("exec");
            ((ChannelExec) channel).setCommand(command);

            // get I/O streams for remote scp
            out = channel.getOutputStream();
            in = channel.getInputStream();
            br = new BufferedReader(new InputStreamReader(in));

            channel.connect();
            // send '\0'
            buf[0] = 0;
            out.write(buf, 0, 1);
            out.flush();

//            int c = checkAck(in);
//            if (c != 'C') {
//                return;
//            }

            // read '0644 '
            in.read(buf, 0, 5);

            while (true) {
                if (in.read(buf, 0, 1) < 0) {
                    // error
                    break;
                }
                if (buf[0] == ' ') break;
                filesize = filesize * 10L + (long) (buf[0] - '0');
            }

            file = null;
            for (int i = 0; ; i++) {
                in.read(buf, i, 1);
                if (buf[i] == (byte) 0x0a) {
                    file = new String(buf, 0, i);
                    break;
                }
            }

            //System.out.println("filesize="+filesize+", file="+file);

            // send '\0'
            buf[0] = 0;
            out.write(buf, 0, 1);
            out.flush();
        }catch (Exception e){
            e.printStackTrace();
            try{
                br.close();
                in.close();
                out.close();
            }catch (IOException ioe){}
        }
    }




    @Override
    public boolean hasNext() {
        return isHasNext;
//        if (isHasNext)
//            return isHasNext;
//        else {
//            try {
//                if (checkAck(in) != 0) {
//                    System.exit(0);
//                }
//
//                buf[0] = 0;
//                out.write(buf, 0, 1);
//                out.flush();
//                br.close();
//                in.close();
//                out.close();
//                session.disconnect();
//                return false;
//            }catch (Exception e){return false;}
//        if(tmp == null) return false;
//        if(tmp == null) {
//            return false;
//                    try {
//                        br.close();
//                in.close();
//                if (checkAck(in) != 0) {
//                    System.exit(0);
//                }
//
//                // send '\0'
//                buf[0] = 0;
//                out.write(buf, 0, 1);
//                out.flush();
//                session.disconnect();
//                        out.close();
//
//                System.exit(0);
//                        return false;
//                    }catch (Exception e){ return false;}
//        }
//        return true;
//        }
    }

    @Override
    public String next() {
//        try {
//            tmp = br.readLine();
//            return tmp;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return tmp;
//        }
        try {
            String tmp = br.readLine();
            //The end of file
            if(tmp == null) {

//                if (checkAck(in) != 0) {
//                    System.exit(0);
//                }

                // send '\0'
//                buf[0] = 0;
//                out.write(buf, 0, 1);
//                out.flush();
//                session.disconnect();

//                in.close();
//                br.close();
//                out.close();

                isHasNext = false;
                return tmp;

            }
            else {return tmp;}
        } catch (IOException e) {
            e.printStackTrace();
            isHasNext = false;
            return null;
        }
//            try {
////                isHasNext = false;
//                in.close();
//                br.close();
//                out.close();
//                session.disconnect();
//            }catch (Exception e) { /*isHasNext = false;*/}
//        }
    }

    @Override
    public void remove() {

    }

}
