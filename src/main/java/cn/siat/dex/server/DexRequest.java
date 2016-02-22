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
public class DexRequest implements org.apache.thrift.TBase<DexRequest, DexRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DexRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DexRequest");

  private static final org.apache.thrift.protocol.TField INPUT_DES_FIELD_DESC = new org.apache.thrift.protocol.TField("inputDes", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField APP_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("appType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("params", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_MODEL_FIELD_DESC = new org.apache.thrift.protocol.TField("dataModel", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DexRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DexRequestTupleSchemeFactory());
  }

  public DexInputDes inputDes; // required
  public DexAppType appType; // required
  public DexParams params; // required
  public DexDataModel dataModel; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INPUT_DES((short)1, "inputDes"),
    APP_TYPE((short)2, "appType"),
    PARAMS((short)3, "params"),
    DATA_MODEL((short)4, "dataModel");

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
        case 1: // INPUT_DES
          return INPUT_DES;
        case 2: // APP_TYPE
          return APP_TYPE;
        case 3: // PARAMS
          return PARAMS;
        case 4: // DATA_MODEL
          return DATA_MODEL;
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
    tmpMap.put(_Fields.INPUT_DES, new org.apache.thrift.meta_data.FieldMetaData("inputDes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "DexInputDes")));
    tmpMap.put(_Fields.APP_TYPE, new org.apache.thrift.meta_data.FieldMetaData("appType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "DexAppType")));
    tmpMap.put(_Fields.PARAMS, new org.apache.thrift.meta_data.FieldMetaData("params", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "DexParams")));
    tmpMap.put(_Fields.DATA_MODEL, new org.apache.thrift.meta_data.FieldMetaData("dataModel", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "DexDataModel")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DexRequest.class, metaDataMap);
  }

  public DexRequest() {
  }

  public DexRequest(
    DexInputDes inputDes,
    DexAppType appType,
    DexParams params,
    DexDataModel dataModel)
  {
    this();
    this.inputDes = inputDes;
    this.appType = appType;
    this.params = params;
    this.dataModel = dataModel;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DexRequest(DexRequest other) {
    if (other.isSetInputDes()) {
      this.inputDes = other.inputDes;
    }
    if (other.isSetAppType()) {
      this.appType = other.appType;
    }
    if (other.isSetParams()) {
      this.params = other.params;
    }
    if (other.isSetDataModel()) {
      this.dataModel = other.dataModel;
    }
  }

  public DexRequest deepCopy() {
    return new DexRequest(this);
  }

  @Override
  public void clear() {
    this.inputDes = null;
    this.appType = null;
    this.params = null;
    this.dataModel = null;
  }

  public DexInputDes getInputDes() {
    return this.inputDes;
  }

  public DexRequest setInputDes(DexInputDes inputDes) {
    this.inputDes = inputDes;
    return this;
  }

  public void unsetInputDes() {
    this.inputDes = null;
  }

  /** Returns true if field inputDes is set (has been assigned a value) and false otherwise */
  public boolean isSetInputDes() {
    return this.inputDes != null;
  }

  public void setInputDesIsSet(boolean value) {
    if (!value) {
      this.inputDes = null;
    }
  }

  public DexAppType getAppType() {
    return this.appType;
  }

  public DexRequest setAppType(DexAppType appType) {
    this.appType = appType;
    return this;
  }

  public void unsetAppType() {
    this.appType = null;
  }

  /** Returns true if field appType is set (has been assigned a value) and false otherwise */
  public boolean isSetAppType() {
    return this.appType != null;
  }

  public void setAppTypeIsSet(boolean value) {
    if (!value) {
      this.appType = null;
    }
  }

  public DexParams getParams() {
    return this.params;
  }

  public DexRequest setParams(DexParams params) {
    this.params = params;
    return this;
  }

  public void unsetParams() {
    this.params = null;
  }

  /** Returns true if field params is set (has been assigned a value) and false otherwise */
  public boolean isSetParams() {
    return this.params != null;
  }

  public void setParamsIsSet(boolean value) {
    if (!value) {
      this.params = null;
    }
  }

  public DexDataModel getDataModel() {
    return this.dataModel;
  }

  public DexRequest setDataModel(DexDataModel dataModel) {
    this.dataModel = dataModel;
    return this;
  }

  public void unsetDataModel() {
    this.dataModel = null;
  }

  /** Returns true if field dataModel is set (has been assigned a value) and false otherwise */
  public boolean isSetDataModel() {
    return this.dataModel != null;
  }

  public void setDataModelIsSet(boolean value) {
    if (!value) {
      this.dataModel = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INPUT_DES:
      if (value == null) {
        unsetInputDes();
      } else {
        setInputDes((DexInputDes)value);
      }
      break;

    case APP_TYPE:
      if (value == null) {
        unsetAppType();
      } else {
        setAppType((DexAppType)value);
      }
      break;

    case PARAMS:
      if (value == null) {
        unsetParams();
      } else {
        setParams((DexParams)value);
      }
      break;

    case DATA_MODEL:
      if (value == null) {
        unsetDataModel();
      } else {
        setDataModel((DexDataModel)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INPUT_DES:
      return getInputDes();

    case APP_TYPE:
      return getAppType();

    case PARAMS:
      return getParams();

    case DATA_MODEL:
      return getDataModel();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INPUT_DES:
      return isSetInputDes();
    case APP_TYPE:
      return isSetAppType();
    case PARAMS:
      return isSetParams();
    case DATA_MODEL:
      return isSetDataModel();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DexRequest)
      return this.equals((DexRequest)that);
    return false;
  }

  public boolean equals(DexRequest that) {
    if (that == null)
      return false;

    boolean this_present_inputDes = true && this.isSetInputDes();
    boolean that_present_inputDes = true && that.isSetInputDes();
    if (this_present_inputDes || that_present_inputDes) {
      if (!(this_present_inputDes && that_present_inputDes))
        return false;
      if (!this.inputDes.equals(that.inputDes))
        return false;
    }

    boolean this_present_appType = true && this.isSetAppType();
    boolean that_present_appType = true && that.isSetAppType();
    if (this_present_appType || that_present_appType) {
      if (!(this_present_appType && that_present_appType))
        return false;
      if (!this.appType.equals(that.appType))
        return false;
    }

    boolean this_present_params = true && this.isSetParams();
    boolean that_present_params = true && that.isSetParams();
    if (this_present_params || that_present_params) {
      if (!(this_present_params && that_present_params))
        return false;
      if (!this.params.equals(that.params))
        return false;
    }

    boolean this_present_dataModel = true && this.isSetDataModel();
    boolean that_present_dataModel = true && that.isSetDataModel();
    if (this_present_dataModel || that_present_dataModel) {
      if (!(this_present_dataModel && that_present_dataModel))
        return false;
      if (!this.dataModel.equals(that.dataModel))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_inputDes = true && (isSetInputDes());
    list.add(present_inputDes);
    if (present_inputDes)
      list.add(inputDes);

    boolean present_appType = true && (isSetAppType());
    list.add(present_appType);
    if (present_appType)
      list.add(appType.getValue());

    boolean present_params = true && (isSetParams());
    list.add(present_params);
    if (present_params)
      list.add(params);

    boolean present_dataModel = true && (isSetDataModel());
    list.add(present_dataModel);
    if (present_dataModel)
      list.add(dataModel);

    return list.hashCode();
  }

  @Override
  public int compareTo(DexRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetInputDes()).compareTo(other.isSetInputDes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputDes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputDes, other.inputDes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppType()).compareTo(other.isSetAppType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appType, other.appType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParams()).compareTo(other.isSetParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params, other.params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataModel()).compareTo(other.isSetDataModel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataModel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataModel, other.dataModel);
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
    StringBuilder sb = new StringBuilder("DexRequest(");
    boolean first = true;

    sb.append("inputDes:");
    if (this.inputDes == null) {
      sb.append("null");
    } else {
      sb.append(this.inputDes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("appType:");
    if (this.appType == null) {
      sb.append("null");
    } else {
      sb.append(this.appType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("params:");
    if (this.params == null) {
      sb.append("null");
    } else {
      sb.append(this.params);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataModel:");
    if (this.dataModel == null) {
      sb.append("null");
    } else {
      sb.append(this.dataModel);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (inputDes == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'inputDes' was not present! Struct: " + toString());
    }
    if (appType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'appType' was not present! Struct: " + toString());
    }
    if (params == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'params' was not present! Struct: " + toString());
    }
    if (dataModel == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dataModel' was not present! Struct: " + toString());
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

  private static class DexRequestStandardSchemeFactory implements SchemeFactory {
    public DexRequestStandardScheme getScheme() {
      return new DexRequestStandardScheme();
    }
  }

  private static class DexRequestStandardScheme extends StandardScheme<DexRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DexRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INPUT_DES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.inputDes = new DexInputDes();
              struct.inputDes.read(iprot);
              struct.setInputDesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APP_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.appType = cn.siat.dex.server.DexAppType.findByValue(iprot.readI32());
              struct.setAppTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.params = new DexParams();
              struct.params.read(iprot);
              struct.setParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA_MODEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.dataModel = new DexDataModel();
              struct.dataModel.read(iprot);
              struct.setDataModelIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DexRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.inputDes != null) {
        oprot.writeFieldBegin(INPUT_DES_FIELD_DESC);
        struct.inputDes.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.appType != null) {
        oprot.writeFieldBegin(APP_TYPE_FIELD_DESC);
        oprot.writeI32(struct.appType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.params != null) {
        oprot.writeFieldBegin(PARAMS_FIELD_DESC);
        struct.params.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.dataModel != null) {
        oprot.writeFieldBegin(DATA_MODEL_FIELD_DESC);
        struct.dataModel.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DexRequestTupleSchemeFactory implements SchemeFactory {
    public DexRequestTupleScheme getScheme() {
      return new DexRequestTupleScheme();
    }
  }

  private static class DexRequestTupleScheme extends TupleScheme<DexRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DexRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.inputDes.write(oprot);
      oprot.writeI32(struct.appType.getValue());
      struct.params.write(oprot);
      struct.dataModel.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DexRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.inputDes = new DexInputDes();
      struct.inputDes.read(iprot);
      struct.setInputDesIsSet(true);
      struct.appType = cn.siat.dex.server.DexAppType.findByValue(iprot.readI32());
      struct.setAppTypeIsSet(true);
      struct.params = new DexParams();
      struct.params.read(iprot);
      struct.setParamsIsSet(true);
      struct.dataModel = new DexDataModel();
      struct.dataModel.read(iprot);
      struct.setDataModelIsSet(true);
    }
  }

}

