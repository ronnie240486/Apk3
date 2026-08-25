package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public final enum ImportFlag extends java.lang.Enum<io.realm.ImportFlag> {
    private static final /* synthetic */ io.realm.ImportFlag[] $VALUES = null;
    public static final io.realm.ImportFlag CHECK_SAME_VALUES_BEFORE_SET = null;

    static {
            io.realm.ImportFlag r0 = new io.realm.ImportFlag
            java.lang.String r1 = "CHECK_SAME_VALUES_BEFORE_SET"
            r2 = 0
            r0.<init>(r1, r2)
            io.realm.ImportFlag.CHECK_SAME_VALUES_BEFORE_SET = r0
            r1 = 1
            io.realm.ImportFlag[] r1 = new io.realm.ImportFlag[r1]
            r1[r2] = r0
            io.realm.ImportFlag.$VALUES = r1
            return
    }

    private ImportFlag(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.realm.ImportFlag valueOf(java.lang.String r1) {
            java.lang.Class<io.realm.ImportFlag> r0 = io.realm.ImportFlag.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.realm.ImportFlag r1 = (io.realm.ImportFlag) r1
            return r1
    }

    public static io.realm.ImportFlag[] values() {
            io.realm.ImportFlag[] r0 = io.realm.ImportFlag.$VALUES
            java.lang.Object r0 = r0.clone()
            io.realm.ImportFlag[] r0 = (io.realm.ImportFlag[]) r0
            return r0
    }
}
