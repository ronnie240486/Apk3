package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes2.dex */
class PropertyModelSerializationImpl<T> implements org.bson.codecs.pojo.PropertySerialization<T> {
    public PropertyModelSerializationImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.pojo.PropertySerialization
    public boolean shouldSerialize(T r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }
}
