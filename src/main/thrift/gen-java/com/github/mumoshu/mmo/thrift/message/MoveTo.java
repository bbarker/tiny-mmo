/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.github.mumoshu.mmo.thrift.message;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-03-13")
public class MoveTo implements org.apache.thrift.TBase<MoveTo, MoveTo._Fields>, java.io.Serializable, Cloneable, Comparable<MoveTo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MoveTo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField X_FIELD_DESC = new org.apache.thrift.protocol.TField("x", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField Z_FIELD_DESC = new org.apache.thrift.protocol.TField("z", org.apache.thrift.protocol.TType.DOUBLE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MoveToStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MoveToTupleSchemeFactory());
  }

  public String id; // required
  public double x; // required
  public double z; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    X((short)2, "x"),
    Z((short)3, "z");

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
        case 1: // ID
          return ID;
        case 2: // X
          return X;
        case 3: // Z
          return Z;
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
  private static final int __X_ISSET_ID = 0;
  private static final int __Z_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.X, new org.apache.thrift.meta_data.FieldMetaData("x", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Z, new org.apache.thrift.meta_data.FieldMetaData("z", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MoveTo.class, metaDataMap);
  }

  public MoveTo() {
  }

  public MoveTo(
    String id,
    double x,
    double z)
  {
    this();
    this.id = id;
    this.x = x;
    setXIsSet(true);
    this.z = z;
    setZIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MoveTo(MoveTo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.x = other.x;
    this.z = other.z;
  }

  public MoveTo deepCopy() {
    return new MoveTo(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setXIsSet(false);
    this.x = 0.0;
    setZIsSet(false);
    this.z = 0.0;
  }

  public String getId() {
    return this.id;
  }

  public MoveTo setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public double getX() {
    return this.x;
  }

  public MoveTo setX(double x) {
    this.x = x;
    setXIsSet(true);
    return this;
  }

  public void unsetX() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __X_ISSET_ID);
  }

  /** Returns true if field x is set (has been assigned a value) and false otherwise */
  public boolean isSetX() {
    return EncodingUtils.testBit(__isset_bitfield, __X_ISSET_ID);
  }

  public void setXIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __X_ISSET_ID, value);
  }

  public double getZ() {
    return this.z;
  }

  public MoveTo setZ(double z) {
    this.z = z;
    setZIsSet(true);
    return this;
  }

  public void unsetZ() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __Z_ISSET_ID);
  }

  /** Returns true if field z is set (has been assigned a value) and false otherwise */
  public boolean isSetZ() {
    return EncodingUtils.testBit(__isset_bitfield, __Z_ISSET_ID);
  }

  public void setZIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __Z_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case X:
      if (value == null) {
        unsetX();
      } else {
        setX((Double)value);
      }
      break;

    case Z:
      if (value == null) {
        unsetZ();
      } else {
        setZ((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case X:
      return getX();

    case Z:
      return getZ();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case X:
      return isSetX();
    case Z:
      return isSetZ();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MoveTo)
      return this.equals((MoveTo)that);
    return false;
  }

  public boolean equals(MoveTo that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_x = true;
    boolean that_present_x = true;
    if (this_present_x || that_present_x) {
      if (!(this_present_x && that_present_x))
        return false;
      if (this.x != that.x)
        return false;
    }

    boolean this_present_z = true;
    boolean that_present_z = true;
    if (this_present_z || that_present_z) {
      if (!(this_present_z && that_present_z))
        return false;
      if (this.z != that.z)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_x = true;
    list.add(present_x);
    if (present_x)
      list.add(x);

    boolean present_z = true;
    list.add(present_z);
    if (present_z)
      list.add(z);

    return list.hashCode();
  }

  @Override
  public int compareTo(MoveTo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetX()).compareTo(other.isSetX());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x, other.x);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetZ()).compareTo(other.isSetZ());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetZ()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.z, other.z);
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
    StringBuilder sb = new StringBuilder("MoveTo(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("x:");
    sb.append(this.x);
    first = false;
    if (!first) sb.append(", ");
    sb.append("z:");
    sb.append(this.z);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MoveToStandardSchemeFactory implements SchemeFactory {
    public MoveToStandardScheme getScheme() {
      return new MoveToStandardScheme();
    }
  }

  private static class MoveToStandardScheme extends StandardScheme<MoveTo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MoveTo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // X
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.x = iprot.readDouble();
              struct.setXIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // Z
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.z = iprot.readDouble();
              struct.setZIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MoveTo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(X_FIELD_DESC);
      oprot.writeDouble(struct.x);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Z_FIELD_DESC);
      oprot.writeDouble(struct.z);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MoveToTupleSchemeFactory implements SchemeFactory {
    public MoveToTupleScheme getScheme() {
      return new MoveToTupleScheme();
    }
  }

  private static class MoveToTupleScheme extends TupleScheme<MoveTo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MoveTo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetX()) {
        optionals.set(1);
      }
      if (struct.isSetZ()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetX()) {
        oprot.writeDouble(struct.x);
      }
      if (struct.isSetZ()) {
        oprot.writeDouble(struct.z);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MoveTo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.x = iprot.readDouble();
        struct.setXIsSet(true);
      }
      if (incoming.get(2)) {
        struct.z = iprot.readDouble();
        struct.setZIsSet(true);
      }
    }
  }

}

