// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.NoFields in no_fields.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

class NoFields(
  unknownFields: ByteString = ByteString.EMPTY
) : Message<NoFields, NoFields.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NoFields) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "NoFields{}"

  fun copy(unknownFields: ByteString = this.unknownFields): NoFields = NoFields(unknownFields)

  class Builder : Message.Builder<NoFields, Builder>() {
    override fun build(): NoFields = NoFields(
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<NoFields> = object : ProtoAdapter<NoFields>(
      FieldEncoding.LENGTH_DELIMITED, 
      NoFields::class, 
      "type.googleapis.com/squareup.protos.kotlin.NoFields", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: NoFields): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter, value: NoFields) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): NoFields {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return NoFields(
          unknownFields = unknownFields
        )
      }

      override fun redact(value: NoFields): NoFields = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
