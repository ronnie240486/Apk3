package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
public interface StrictJsonWriter {
    boolean isTruncated();

    void writeBoolean(java.lang.String r1, boolean r2);

    void writeBoolean(boolean r1);

    void writeEndArray();

    void writeEndObject();

    void writeName(java.lang.String r1);

    void writeNull();

    void writeNull(java.lang.String r1);

    void writeNumber(java.lang.String r1);

    void writeNumber(java.lang.String r1, java.lang.String r2);

    void writeRaw(java.lang.String r1);

    void writeRaw(java.lang.String r1, java.lang.String r2);

    void writeStartArray();

    void writeStartArray(java.lang.String r1);

    void writeStartObject();

    void writeStartObject(java.lang.String r1);

    void writeString(java.lang.String r1);

    void writeString(java.lang.String r1, java.lang.String r2);
}
