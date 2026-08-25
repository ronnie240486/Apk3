package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public final enum Sort extends java.lang.Enum<io.realm.Sort> {
    private static final /* synthetic */ io.realm.Sort[] $VALUES = null;
    public static final io.realm.Sort ASCENDING = null;
    public static final io.realm.Sort DESCENDING = null;
    private final boolean value;

    static {
            io.realm.Sort r0 = new io.realm.Sort
            java.lang.String r1 = "ASCENDING"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            io.realm.Sort.ASCENDING = r0
            io.realm.Sort r1 = new io.realm.Sort
            java.lang.String r4 = "DESCENDING"
            r1.<init>(r4, r3, r2)
            io.realm.Sort.DESCENDING = r1
            r4 = 2
            io.realm.Sort[] r4 = new io.realm.Sort[r4]
            r4[r2] = r0
            r4[r3] = r1
            io.realm.Sort.$VALUES = r4
            return
    }

    private Sort(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static io.realm.Sort valueOf(java.lang.String r1) {
            java.lang.Class<io.realm.Sort> r0 = io.realm.Sort.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.realm.Sort r1 = (io.realm.Sort) r1
            return r1
    }

    public static io.realm.Sort[] values() {
            io.realm.Sort[] r0 = io.realm.Sort.$VALUES
            java.lang.Object r0 = r0.clone()
            io.realm.Sort[] r0 = (io.realm.Sort[]) r0
            return r0
    }

    public boolean getValue() {
            r1 = this;
            boolean r0 = r1.value
            return r0
    }
}
