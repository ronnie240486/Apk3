package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public interface BSONObject {
    boolean containsField(java.lang.String r1);

    @java.lang.Deprecated
    boolean containsKey(java.lang.String r1);

    java.lang.Object get(java.lang.String r1);

    java.util.Set<java.lang.String> keySet();

    java.lang.Object put(java.lang.String r1, java.lang.Object r2);

    void putAll(java.util.Map r1);

    void putAll(org.bson.BSONObject r1);

    java.lang.Object removeField(java.lang.String r1);

    java.util.Map toMap();
}
