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
public class DexDataModel implements org.apache.thrift.TBase<DexDataModel, DexDataModel._Fields>, java.io.Serializable, Cloneable, Comparable<DexDataModel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DexDataModel");

  private static final org.apache.thrift.protocol.TField COL_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("colTypes", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DexDataModelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DexDataModelTupleSchemeFactory());
  }

  public List<String> colTypes; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COL_TYPES((short)1, "colTypes");

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
        case 1: // COL_TYPES
          return COL_TYPES;
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
    tmpMap.put(_Fields.COL_TYPES, new org.apache.thrift.meta_data.FieldMetaData("colTypes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DexDataModel.class, metaDataMap);
  }

  public DexDataModel() {
  }

  public DexDataModel(
    List<String> colTypes)
  {
    this();
    this.colTypes = colTypes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DexDataModel(DexDataModel other) {
    if (other.isSetColTypes()) {
      List<String> __this__colTypes = new ArrayList<String>(other.colTypes);
      this.colTypes = __this__colTypes;
    }
  }

  public DexDataModel deepCopy() {
    return new DexDataModel(this);
  }

  @Override
  public void clear() {
    this.colTypes = null;
  }

  public int getColTypesSize() {
    return (this.colTypes == null) ? 0 : this.colTypes.size();
  }

  public java.util.Iterator<String> getColTypesIterator() {
    return (this.colTypes == null) ? null : this.colTypes.iterator();
  }

  public void addToColTypes(String elem) {
    if (this.colTypes == null) {
      this.colTypes = new ArrayList<String>();
    }
    this.colTypes.add(elem);
  }

  public List<String> getColTypes() {
    return this.colTypes;
  }

  public DexDataModel setColTypes(List<String> colTypes) {
    this.colTypes = colTypes;
    return this;
  }

  public void unsetColTypes() {
    this.colTypes = null;
  }

  /** Returns true if field colTypes is set (has been assigned a value) and false otherwise */
  public boolean isSetColTypes() {
    return this.colTypes != null;
  }

  public void setColTypesIsSet(boolean value) {
    if (!value) {
      this.colTypes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COL_TYPES:
      if (value == null) {
        unsetColTypes();
      } else {
        setColTypes((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COL_TYPES:
      return getColTypes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COL_TYPES:
      return isSetColTypes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DexDataModel)
      return this.equals((DexDataModel)that);
    return false;
  }

  public boolean equals(DexDataModel that) {
    if (that == null)
      return false;

    boolean this_present_colTypes = true && this.isSetColTypes();
    boolean that_present_colTypes = true && that.isSetColTypes();
    if (this_present_colTypes || that_present_colTypes) {
      if (!(this_present_colTypes && that_present_colTypes))
        return false;
      if (!this.colTypes.equals(that.colTypes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_colTypes = true && (isSetColTypes());
    list.add(present_colTypes);
    if (present_colTypes)
      list.add(colTypes);

    return list.hashCode();
  }

  @Override
  public int compareTo(DexDataModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetColTypes()).compareTo(other.isSetColTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColTypes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colTypes, other.colTypes);
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
    StringBuilder sb = new StringBuilder("DexDataModel(");
    boolean first = true;

    sb.append("colTypes:");
    if (this.colTypes == null) {
      sb.append("null");
    } else {
      sb.append(this.colTypes);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (colTypes == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'colTypes' was not present! Struct: " + toString());
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

  private static class DexDataModelStandardSchemeFactory implements SchemeFactory {
    public DexDataModelStandardScheme getScheme() {
      return new DexDataModelStandardScheme();
    }
  }

  private static class DexDataModelStandardScheme extends StandardScheme<DexDataModel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DexDataModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COL_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.colTypes = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.colTypes.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setColTypesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DexDataModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.colTypes != null) {
        oprot.writeFieldBegin(COL_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.colTypes.size()));
          for (String _iter11 : struct.colTypes)
          {
            oprot.writeString(_iter11);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DexDataModelTupleSchemeFactory implements SchemeFactory {
    public DexDataModelTupleScheme getScheme() {
      return new DexDataModelTupleScheme();
    }
  }

  private static class DexDataModelTupleScheme extends TupleScheme<DexDataModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DexDataModel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.colTypes.size());
        for (String _iter12 : struct.colTypes)
        {
          oprot.writeString(_iter12);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DexDataModel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.colTypes = new ArrayList<String>(_list13.size);
        String _elem14;
        for (int _i15 = 0; _i15 < _list13.size; ++_i15)
        {
          _elem14 = iprot.readString();
          struct.colTypes.add(_elem14);
        }
      }
      struct.setColTypesIsSet(true);
    }
  }

}

