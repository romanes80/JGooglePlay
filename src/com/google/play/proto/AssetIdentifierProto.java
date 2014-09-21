// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Asset.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class AssetIdentifierProto extends Message {

  public static final String DEFAULT_PACKAGENAME = "";
  public static final Integer DEFAULT_VERSIONCODE = 0;
  public static final String DEFAULT_ASSETID = "";

  @ProtoField(tag = 1, type = STRING)
  public final String packageName;

  @ProtoField(tag = 2, type = INT32)
  public final Integer versionCode;

  @ProtoField(tag = 3, type = STRING)
  public final String assetId;

  public AssetIdentifierProto(String packageName, Integer versionCode, String assetId) {
    this.packageName = packageName;
    this.versionCode = versionCode;
    this.assetId = assetId;
  }

  private AssetIdentifierProto(Builder builder) {
    this(builder.packageName, builder.versionCode, builder.assetId);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AssetIdentifierProto)) return false;
    AssetIdentifierProto o = (AssetIdentifierProto) other;
    return equals(packageName, o.packageName)
        && equals(versionCode, o.versionCode)
        && equals(assetId, o.assetId);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = packageName != null ? packageName.hashCode() : 0;
      result = result * 37 + (versionCode != null ? versionCode.hashCode() : 0);
      result = result * 37 + (assetId != null ? assetId.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AssetIdentifierProto> {

    public String packageName;
    public Integer versionCode;
    public String assetId;

    public Builder() {
    }

    public Builder(AssetIdentifierProto message) {
      super(message);
      if (message == null) return;
      this.packageName = message.packageName;
      this.versionCode = message.versionCode;
      this.assetId = message.assetId;
    }

    public Builder packageName(String packageName) {
      this.packageName = packageName;
      return this;
    }

    public Builder versionCode(Integer versionCode) {
      this.versionCode = versionCode;
      return this;
    }

    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    @Override
    public AssetIdentifierProto build() {
      return new AssetIdentifierProto(this);
    }
  }
}