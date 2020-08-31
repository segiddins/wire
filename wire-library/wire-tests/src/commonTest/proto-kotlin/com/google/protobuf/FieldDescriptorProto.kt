// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.FieldDescriptorProto in google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

/**
 * Describes a field within a message.
 */
class FieldDescriptorProto(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val name: String? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val number: Int? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.google.protobuf.FieldDescriptorProto${'$'}Label#ADAPTER"
  )
  val label: Label? = null,
  /**
   * If type_name is set, this need not be set.  If both this and type_name
   * are set, this must be one of TYPE_ENUM, TYPE_MESSAGE or TYPE_GROUP.
   */
  @field:WireField(
    tag = 5,
    adapter = "com.google.protobuf.FieldDescriptorProto${'$'}Type#ADAPTER"
  )
  val type: Type? = null,
  /**
   * For message and enum types, this is the name of the type.  If the name
   * starts with a '.', it is fully-qualified.  Otherwise, C++-like scoping
   * rules are used to find the type (i.e. first the nested types within this
   * message are searched, then within the parent, on up to the root
   * namespace).
   */
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val type_name: String? = null,
  /**
   * For extensions, this is the name of the type being extended.  It is
   * resolved in the same manner as type_name.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val extendee: String? = null,
  /**
   * For numeric types, contains the original text representation of the value.
   * For booleans, "true" or "false".
   * For strings, contains the default text contents (not escaped in any way).
   * For bytes, contains the C escaped value.  All bytes >= 128 are escaped.
   * TODO(kenton):  Base-64 encode?
   */
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val default_value: String? = null,
  /**
   * If set, gives the index of a oneof in the containing type's oneof_decl
   * list.  This field is a member of that oneof.
   */
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  val oneof_index: Int? = null,
  /**
   * JSON name of this field. The value is set by protocol compiler. If the
   * user has set a "json_name" option on this field, that option's value
   * will be used. Otherwise, it's deduced from the field's name by converting
   * it to camelCase.
   */
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val json_name: String? = null,
  @field:WireField(
    tag = 8,
    adapter = "com.google.protobuf.FieldOptions#ADAPTER"
  )
  val options: FieldOptions? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<FieldDescriptorProto, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FieldDescriptorProto) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    if (number != other.number) return false
    if (label != other.label) return false
    if (type != other.type) return false
    if (type_name != other.type_name) return false
    if (extendee != other.extendee) return false
    if (default_value != other.default_value) return false
    if (oneof_index != other.oneof_index) return false
    if (json_name != other.json_name) return false
    if (options != other.options) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + number.hashCode()
      result = result * 37 + label.hashCode()
      result = result * 37 + type.hashCode()
      result = result * 37 + type_name.hashCode()
      result = result * 37 + extendee.hashCode()
      result = result * 37 + default_value.hashCode()
      result = result * 37 + oneof_index.hashCode()
      result = result * 37 + json_name.hashCode()
      result = result * 37 + options.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (name != null) result += """name=${sanitize(name)}"""
    if (number != null) result += """number=$number"""
    if (label != null) result += """label=$label"""
    if (type != null) result += """type=$type"""
    if (type_name != null) result += """type_name=${sanitize(type_name)}"""
    if (extendee != null) result += """extendee=${sanitize(extendee)}"""
    if (default_value != null) result += """default_value=${sanitize(default_value)}"""
    if (oneof_index != null) result += """oneof_index=$oneof_index"""
    if (json_name != null) result += """json_name=${sanitize(json_name)}"""
    if (options != null) result += """options=$options"""
    return result.joinToString(prefix = "FieldDescriptorProto{", separator = ", ", postfix = "}")
  }

  fun copy(
    name: String? = this.name,
    number: Int? = this.number,
    label: Label? = this.label,
    type: Type? = this.type,
    type_name: String? = this.type_name,
    extendee: String? = this.extendee,
    default_value: String? = this.default_value,
    oneof_index: Int? = this.oneof_index,
    json_name: String? = this.json_name,
    options: FieldOptions? = this.options,
    unknownFields: ByteString = this.unknownFields
  ): FieldDescriptorProto = FieldDescriptorProto(name, number, label, type, type_name, extendee,
      default_value, oneof_index, json_name, options, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<FieldDescriptorProto> = object : ProtoAdapter<FieldDescriptorProto>(
      FieldEncoding.LENGTH_DELIMITED, 
      FieldDescriptorProto::class, 
      "type.googleapis.com/google.protobuf.FieldDescriptorProto", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: FieldDescriptorProto): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        size += ProtoAdapter.INT32.encodedSizeWithTag(3, value.number)
        size += Label.ADAPTER.encodedSizeWithTag(4, value.label)
        size += Type.ADAPTER.encodedSizeWithTag(5, value.type)
        size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.type_name)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.extendee)
        size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.default_value)
        size += ProtoAdapter.INT32.encodedSizeWithTag(9, value.oneof_index)
        size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.json_name)
        size += FieldOptions.ADAPTER.encodedSizeWithTag(8, value.options)
        return size
      }

      override fun encode(writer: ProtoWriter, value: FieldDescriptorProto) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.number)
        Label.ADAPTER.encodeWithTag(writer, 4, value.label)
        Type.ADAPTER.encodeWithTag(writer, 5, value.type)
        ProtoAdapter.STRING.encodeWithTag(writer, 6, value.type_name)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.extendee)
        ProtoAdapter.STRING.encodeWithTag(writer, 7, value.default_value)
        ProtoAdapter.INT32.encodeWithTag(writer, 9, value.oneof_index)
        ProtoAdapter.STRING.encodeWithTag(writer, 10, value.json_name)
        FieldOptions.ADAPTER.encodeWithTag(writer, 8, value.options)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): FieldDescriptorProto {
        var name: String? = null
        var number: Int? = null
        var label: Label? = null
        var type: Type? = null
        var type_name: String? = null
        var extendee: String? = null
        var default_value: String? = null
        var oneof_index: Int? = null
        var json_name: String? = null
        var options: FieldOptions? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            3 -> number = ProtoAdapter.INT32.decode(reader)
            4 -> try {
              label = Label.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            5 -> try {
              type = Type.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            6 -> type_name = ProtoAdapter.STRING.decode(reader)
            2 -> extendee = ProtoAdapter.STRING.decode(reader)
            7 -> default_value = ProtoAdapter.STRING.decode(reader)
            9 -> oneof_index = ProtoAdapter.INT32.decode(reader)
            10 -> json_name = ProtoAdapter.STRING.decode(reader)
            8 -> options = FieldOptions.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return FieldDescriptorProto(
          name = name,
          number = number,
          label = label,
          type = type,
          type_name = type_name,
          extendee = extendee,
          default_value = default_value,
          oneof_index = oneof_index,
          json_name = json_name,
          options = options,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: FieldDescriptorProto): FieldDescriptorProto = value.copy(
        options = value.options?.let(FieldOptions.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  enum class Type(
    override val value: Int
  ) : WireEnum {
    /**
     * 0 is reserved for errors.
     * Order is weird for historical reasons.
     */
    TYPE_DOUBLE(1),

    TYPE_FLOAT(2),

    /**
     * Not ZigZag encoded.  Negative numbers take 10 bytes.  Use TYPE_SINT64 if
     * negative values are likely.
     */
    TYPE_INT64(3),

    TYPE_UINT64(4),

    /**
     * Not ZigZag encoded.  Negative numbers take 10 bytes.  Use TYPE_SINT32 if
     * negative values are likely.
     */
    TYPE_INT32(5),

    TYPE_FIXED64(6),

    TYPE_FIXED32(7),

    TYPE_BOOL(8),

    TYPE_STRING(9),

    /**
     * Tag-delimited aggregate.
     * Group type is deprecated and not supported in proto3. However, Proto3
     * implementations should still be able to parse the group wire format and
     * treat group fields as unknown fields.
     */
    TYPE_GROUP(10),

    /**
     * Length-delimited aggregate.
     */
    TYPE_MESSAGE(11),

    /**
     * New in version 2.
     */
    TYPE_BYTES(12),

    TYPE_UINT32(13),

    TYPE_ENUM(14),

    TYPE_SFIXED32(15),

    TYPE_SFIXED64(16),

    /**
     * Uses ZigZag encoding.
     */
    TYPE_SINT32(17),

    /**
     * Uses ZigZag encoding.
     */
    TYPE_SINT64(18);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<Type> = object : EnumAdapter<Type>(
        Type::class, 
        PROTO_2, 
        null
      ) {
        override fun fromValue(value: Int): Type? = Type.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): Type? = when (value) {
        1 -> TYPE_DOUBLE
        2 -> TYPE_FLOAT
        3 -> TYPE_INT64
        4 -> TYPE_UINT64
        5 -> TYPE_INT32
        6 -> TYPE_FIXED64
        7 -> TYPE_FIXED32
        8 -> TYPE_BOOL
        9 -> TYPE_STRING
        10 -> TYPE_GROUP
        11 -> TYPE_MESSAGE
        12 -> TYPE_BYTES
        13 -> TYPE_UINT32
        14 -> TYPE_ENUM
        15 -> TYPE_SFIXED32
        16 -> TYPE_SFIXED64
        17 -> TYPE_SINT32
        18 -> TYPE_SINT64
        else -> null
      }
    }
  }

  enum class Label(
    override val value: Int
  ) : WireEnum {
    /**
     * 0 is reserved for errors
     */
    LABEL_OPTIONAL(1),

    LABEL_REQUIRED(2),

    LABEL_REPEATED(3);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<Label> = object : EnumAdapter<Label>(
        Label::class, 
        PROTO_2, 
        null
      ) {
        override fun fromValue(value: Int): Label? = Label.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): Label? = when (value) {
        1 -> LABEL_OPTIONAL
        2 -> LABEL_REQUIRED
        3 -> LABEL_REPEATED
        else -> null
      }
    }
  }
}
