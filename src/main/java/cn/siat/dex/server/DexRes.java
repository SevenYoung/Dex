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
public class DexRes extends org.apache.thrift.TUnion<DexRes, DexRes._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DexRes");
  private static final org.apache.thrift.protocol.TField SMALL_RES_FIELD_DESC = new org.apache.thrift.protocol.TField("smallRes", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LARGE_RES_FIELD_DESC = new org.apache.thrift.protocol.TField("largeRes", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SMALL_RES((short)1, "smallRes"),
    LARGE_RES((short)2, "largeRes");

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
        case 1: // SMALL_RES
          return SMALL_RES;
        case 2: // LARGE_RES
          return LARGE_RES;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SMALL_RES, new org.apache.thrift.meta_data.FieldMetaData("smallRes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "SmallRes")));
    tmpMap.put(_Fields.LARGE_RES, new org.apache.thrift.meta_data.FieldMetaData("largeRes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "LargeRes")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DexRes.class, metaDataMap);
  }

  public DexRes() {
    super();
  }

  public DexRes(_Fields setField, Object value) {
    super(setField, value);
  }

  public DexRes(DexRes other) {
    super(other);
  }
  public DexRes deepCopy() {
    return new DexRes(this);
  }

  public static DexRes smallRes(SmallRes value) {
    DexRes x = new DexRes();
    x.setSmallRes(value);
    return x;
  }

  public static DexRes largeRes(LargeRes value) {
    DexRes x = new DexRes();
    x.setLargeRes(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case SMALL_RES:
        if (value instanceof SmallRes) {
          break;
        }
        throw new ClassCastException("Was expecting value of type SmallRes for field 'smallRes', but got " + value.getClass().getSimpleName());
      case LARGE_RES:
        if (value instanceof LargeRes) {
          break;
        }
        throw new ClassCastException("Was expecting value of type LargeRes for field 'largeRes', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case SMALL_RES:
          if (field.type == SMALL_RES_FIELD_DESC.type) {
            SmallRes smallRes;
            smallRes = new SmallRes();
            smallRes.read(iprot);
            return smallRes;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LARGE_RES:
          if (field.type == LARGE_RES_FIELD_DESC.type) {
            LargeRes largeRes;
            largeRes = new LargeRes();
            largeRes.read(iprot);
            return largeRes;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case SMALL_RES:
        SmallRes smallRes = (SmallRes)value_;
        smallRes.write(oprot);
        return;
      case LARGE_RES:
        LargeRes largeRes = (LargeRes)value_;
        largeRes.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case SMALL_RES:
          SmallRes smallRes;
          smallRes = new SmallRes();
          smallRes.read(iprot);
          return smallRes;
        case LARGE_RES:
          LargeRes largeRes;
          largeRes = new LargeRes();
          largeRes.read(iprot);
          return largeRes;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case SMALL_RES:
        SmallRes smallRes = (SmallRes)value_;
        smallRes.write(oprot);
        return;
      case LARGE_RES:
        LargeRes largeRes = (LargeRes)value_;
        largeRes.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case SMALL_RES:
        return SMALL_RES_FIELD_DESC;
      case LARGE_RES:
        return LARGE_RES_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public SmallRes getSmallRes() {
    if (getSetField() == _Fields.SMALL_RES) {
      return (SmallRes)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'smallRes' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSmallRes(SmallRes value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.SMALL_RES;
    value_ = value;
  }

  public LargeRes getLargeRes() {
    if (getSetField() == _Fields.LARGE_RES) {
      return (LargeRes)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'largeRes' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLargeRes(LargeRes value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LARGE_RES;
    value_ = value;
  }

  public boolean isSetSmallRes() {
    return setField_ == _Fields.SMALL_RES;
  }


  public boolean isSetLargeRes() {
    return setField_ == _Fields.LARGE_RES;
  }


  public boolean equals(Object other) {
    if (other instanceof DexRes) {
      return equals((DexRes)other);
    } else {
      return false;
    }
  }

  public boolean equals(DexRes other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(DexRes other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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


}