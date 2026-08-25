package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BsonNumber extends org.bson.BsonValue {
    public BsonNumber() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract org.bson.types.Decimal128 decimal128Value();

    public abstract double doubleValue();

    public abstract int intValue();

    public abstract long longValue();
}
