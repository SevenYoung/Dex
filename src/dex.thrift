namespace java cn.siat.dex.server

/*
InternalAdaptor exists in pg, its function is converting sqlQuery into DexRequest and DexResponse into "sqlQuery".
ForeignAdaptor exists in spark,its function is converting DexRequest into service and result into DexResponse.
In one word, all adaptors need to do two things.
*/

struct DexRequest {
    1:required DexInputDes inputDes;
    2:required DexAppType appType;
    3:required DexParams params;
    4:required DexDataModel dataModel;

}

struct DexResponse {
    1:required DexResStatus resStatus;
    2:required DexRes res;
}

struct DexInputDes {
    1:required list<Block> blocks;
}

enum DexAppType {
    WC = 1;
    DTR = 2;
    DTC = 3;
    PGRANK = 4;
    KMEANS = 5;
}

union DexParams {
    1:WCParams wcparams;
    2:DTRParams dtrparams;
    3:DTCParams dtcparams;
    4:PGRANKParams pgrankparams;
    5:KMEANSParams kmeansparams;
}

struct DexDataModel{
    1:required list<string> colTypes;
}

enum DexResStatus {
    EXCEPTION = 1;
    SMALLRES = 2;
    LARGERES = 3;
}

union DexRes {
    1:SmallRes smallRes;
    2:LargeRes largeRes;
}

//Descrip the Block metadata, we now design it stored in file format.
struct Block {
    1:required list<string> hosts;//What hosts this block exists.
    2:required string path;//Path to find the block in approriate host
    3:required i64 start;//Start point of the block.
    4:required i64 len;//length of the block.
    5:required string codec;//Which codec you had used to compress the block.
}

struct WCParams {
    1:optional i32 partitions;//Customize the parallism hint.
}

struct DTRParams {
    1:required string impurity;//Which impurity standard you use, eg: gini ....
    2:required i32 maxDepth;//Max depth of the tree
    3:required i32 maxBins;//Max bins used in the mllib
    4:optional i32 partitions;
}


struct DTCParams {
    1:required i32 numClasses;//How many result classes you need in this computation.
    2:required string impurity;
    3:required i32 maxDepth;
    4:required i32 maxBins;
}

//TO-DO: Make sure what params the pagerank app need.
struct PGRANKParams {

}

//TO-DO: Make sure what params the kmeans app need.
struct KMEANSParams {

}


//TO-DO: Add other types of result.
union SmallRes {
    1:WCRes wcRes;
    2:DTCRes dtcRes;
    3:DTRRes dtrRes;
}

struct LargeRes {
    1:DexResDes resDex;
}

//We store the large res in file format now for first prototype.
struct DexResDes {
    1:required list<Block> blocks;
}

struct WCRes {
    1:required map<string, i64> res;
}

struct DTCRes {
    1:required string res;
}

struct DTRRes {
    1:required string res;
}



service DexService {
   DexResponse  wc(1:WCParams params);
   DexResponse  DTR(1:DTRParams params);
   DexResponse  DTC(1:DTCParams params);
}


