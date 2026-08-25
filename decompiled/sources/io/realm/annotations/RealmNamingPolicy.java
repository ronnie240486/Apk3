package io.realm.annotations;

/* JADX INFO: loaded from: classes2.dex */
public final enum RealmNamingPolicy extends java.lang.Enum<io.realm.annotations.RealmNamingPolicy> {
    private static final /* synthetic */ io.realm.annotations.RealmNamingPolicy[] $VALUES = null;
    public static final io.realm.annotations.RealmNamingPolicy CAMEL_CASE = null;
    public static final io.realm.annotations.RealmNamingPolicy IDENTITY = null;
    public static final io.realm.annotations.RealmNamingPolicy LOWER_CASE_WITH_UNDERSCORES = null;
    public static final io.realm.annotations.RealmNamingPolicy NO_POLICY = null;
    public static final io.realm.annotations.RealmNamingPolicy PASCAL_CASE = null;

    static {
            io.realm.annotations.RealmNamingPolicy r0 = new io.realm.annotations.RealmNamingPolicy
            java.lang.String r1 = "NO_POLICY"
            r2 = 0
            r0.<init>(r1, r2)
            io.realm.annotations.RealmNamingPolicy.NO_POLICY = r0
            io.realm.annotations.RealmNamingPolicy r1 = new io.realm.annotations.RealmNamingPolicy
            java.lang.String r3 = "IDENTITY"
            r4 = 1
            r1.<init>(r3, r4)
            io.realm.annotations.RealmNamingPolicy.IDENTITY = r1
            io.realm.annotations.RealmNamingPolicy r3 = new io.realm.annotations.RealmNamingPolicy
            java.lang.String r5 = "CAMEL_CASE"
            r6 = 2
            r3.<init>(r5, r6)
            io.realm.annotations.RealmNamingPolicy.CAMEL_CASE = r3
            io.realm.annotations.RealmNamingPolicy r5 = new io.realm.annotations.RealmNamingPolicy
            java.lang.String r7 = "PASCAL_CASE"
            r8 = 3
            r5.<init>(r7, r8)
            io.realm.annotations.RealmNamingPolicy.PASCAL_CASE = r5
            io.realm.annotations.RealmNamingPolicy r7 = new io.realm.annotations.RealmNamingPolicy
            java.lang.String r9 = "LOWER_CASE_WITH_UNDERSCORES"
            r10 = 4
            r7.<init>(r9, r10)
            io.realm.annotations.RealmNamingPolicy.LOWER_CASE_WITH_UNDERSCORES = r7
            r9 = 5
            io.realm.annotations.RealmNamingPolicy[] r9 = new io.realm.annotations.RealmNamingPolicy[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            io.realm.annotations.RealmNamingPolicy.$VALUES = r9
            return
    }

    private RealmNamingPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.realm.annotations.RealmNamingPolicy valueOf(java.lang.String r1) {
            java.lang.Class<io.realm.annotations.RealmNamingPolicy> r0 = io.realm.annotations.RealmNamingPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.realm.annotations.RealmNamingPolicy r1 = (io.realm.annotations.RealmNamingPolicy) r1
            return r1
    }

    public static io.realm.annotations.RealmNamingPolicy[] values() {
            io.realm.annotations.RealmNamingPolicy[] r0 = io.realm.annotations.RealmNamingPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            io.realm.annotations.RealmNamingPolicy[] r0 = (io.realm.annotations.RealmNamingPolicy[]) r0
            return r0
    }
}
