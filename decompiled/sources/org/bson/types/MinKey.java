package org.bson.types;

/* JADX INFO: loaded from: classes3.dex */
public final class MinKey implements java.io.Serializable {
    private static final long serialVersionUID = 4075901136671855684L;

    public MinKey() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof org.bson.types.MinKey
            return r1
    }

    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "MinKey"
            return r0
    }
}
