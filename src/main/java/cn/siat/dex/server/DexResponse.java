/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.siat.dex.server;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-13")
public class DexResponse implements org.apache.thrift.TBase<DexResponse, DexResponse._Fields>, java.io.Serializable, Cloneable, Comparable<DexResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DexResponse");

  private static final org.apache.thrift.protocol.TField RES_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("resStatus", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RES_FIELD_DESC = new org.apache.thrift.protocol.TField("res", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DexResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DexResponseTupleSchemeFactory());
  }

  public DexResStatus resStatus; // required
  public DexRes res; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RES_STATUS((short)1, "resStatus"),
    RES((short)2, "res");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RES_STATUS
          return RES_STATUS;
        case 2: // RES
          return RES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RES_STATUS, new org.apache.thrift.meta_data.FieldMetaData("resStatus", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "DexResStatus")));
    tmpMap.put(_Fields.RES, new org.apache.thrift.meta_data.FieldMetaData("res", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "DexRes")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DexResponse.class, metaDataMap);
  }

  public DexResponse() {
  }

  public DexResponse(
    DexResStatus resStatus,
    DexRes res)
  {
    this();
    this.resStatus = resStatus;
    this.res = res;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DexResponse(DexResponse other) {
    if (other.isSetResStatus()) {
      this.resStatus = other.resStatus;
    }
    if (other.isSetRes()) {
      this.res = other.res;
    }
  }

  public DexResponse deepCopy() {
    return new DexResponse(this);
  }

  @Override
  public void clear() {
    this.resStatus = null;
    this.res = null;
  }

  public DexResStatus getResStatus() {
    return this.resStatus;
  }

  public DexResponse setResStatus(DexResStatus resStatus) {
    this.resStatus = resStatus;
    return this;
  }

  public void unsetResStatus() {
    this.resStatus = null;
  }

  /** Returns true if field resStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetResStatus() {
    return this.resStatus != null;
  }

  public void setResStatusIsSet(boolean value) {
    if (!value) {
      this.resStatus = null;
    }
  }

  public DexRes getRes() {
    return this.res;
  }

  public DexResponse setRes(DexRes res) {
    this.res = res;
    return this;
  }

  public void unsetRes() {
    this.res = null;
  }

  /** Returns true if field res is set (has been assigned a value) and false otherwise */
  public boolean isSetRes() {
    return this.res != null;
  }

  public void setResIsSet(boolean value) {
    if (!value) {
      this.res = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RES_STATUS:
      if (value == null) {
        unsetResStatus();
      } else {
        setResStatus((DexResStatus)value);
      }
      break;

    case RES:
      if (value == null) {
        unsetRes();
      } else {
        setRes((DexRes)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RES_STATUS:
      return getResStatus();

    case RES:
      return getRes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RES_STATUS:
      return isSetResStatus();
    case RES:
      return isSetRes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DexResponse)
      return this.equals((DexResponse)that);
    return false;
  }

  public boolean equals(DexResponse that) {
    if (that == null)
      return false;

    boolean this_present_resStatus = true && this.isSetResStatus();
    boolean that_present_resStatus = true && that.isSetResStatus();
    if (this_present_resStatus || that_present_resStatus) {
      if (!(this_present_resStatus && that_present_resStatus))
        return false;
      if (!this.resStatus.equals(that.resStatus))
        return false;
    }

    boolean this_present_res = true && this.isSetRes();
    boolean that_present_res = true && that.isSetRes();
    if (this_present_res || that_present_res) {
      if (!(this_present_res && that_present_res))
        return false;
      if (!this.res.equals(that.res))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resStatus = true && (isSetResStatus());
    list.add(present_resStatus);
    if (present_resStatus)
      list.add(resStatus.getValue());

    boolean present_res = true && (isSetRes());
    list.add(present_res);
    if (present_res)
      list.add(res);

    return list.hashCode();
  }

  @Override
  public int compareTo(DexResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResStatus()).compareTo(other.isSetResStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resStatus, other.resStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRes()).compareTo(other.isSetRes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.res, other.res);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DexResponse(");
    boolean first = true;

    sb.append("resStatus:");
    if (this.resStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.resStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("res:");
    if (this.res == null) {
      sb.append("null");
    } else {
      sb.append(this.res);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (resStatus == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resStatus' was not present! Struct: " + toString());
    }
    if (res == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'res' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DexResponseStandardSchemeFactory implements SchemeFactory {
    public DexResponseStandardScheme getScheme() {
      return new DexResponseStandardScheme();
    }
  }

  private static class DexResponseStandardScheme extends StandardScheme<DexResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DexResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RES_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resStatus = cn.siat.dex.server.DexResStatus.findByValue(iprot.readI32());
              struct.setResStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.res = new DexRes();
              struct.res.read(iprot);
              struct.setResIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DexResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resStatus != null) {
        oprot.writeFieldBegin(RES_STATUS_FIELD_DESC);
        oprot.writeI32(struct.resStatus.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.res != null) {
        oprot.writeFieldBegin(RES_FIELD_DESC);
        struct.res.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DexResponseTupleSchemeFactory implements SchemeFactory {
    public DexResponseTupleScheme getScheme() {
      return new DexResponseTupleScheme();
    }
  }

  private static class DexResponseTupleScheme extends TupleScheme<DexResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DexResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.resStatus.getValue());
      struct.res.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DexResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.resStatus = cn.siat.dex.server.DexResStatus.findByValue(iprot.readI32());
      struct.setResStatusIsSet(true);
      struct.res = new DexRes();
      struct.res.read(iprot);
      struct.setResIsSet(true);
    }
  }

}

