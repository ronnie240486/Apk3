package io.realm;

/* JADX INFO: loaded from: classes.dex */
public final enum Case extends java.lang.Enum<io.realm.Case> {
    private static final /* synthetic */ io.realm.Case[] $VALUES = null;
    public static final io.realm.Case INSENSITIVE = null;
    public static final io.realm.Case SENSITIVE = null;
    private final boolean value;

    static {
            io.realm.Case r0 = new io.realm.Case
            java.lang.String r1 = "SENSITIVE"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            io.realm.Case.SENSITIVE = r0
            io.realm.Case r1 = new io.realm.Case
            java.lang.String r4 = "INSENSITIVE"
            r1.<init>(r4, r3, r2)
            io.realm.Case.INSENSITIVE = r1
            r4 = 2
            io.realm.Case[] r4 = new io.realm.Case[r4]
            r4[r2] = r0
            r4[r3] = r1
            io.realm.Case.$VALUES = r4
            return
    }

    private Case(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static io.realm.Case valueOf(java.lang.String r1) {
            java.lang.Class<io.realm.Case> r0 = io.realm.Case.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.realm.Case r1 = (io.realm.Case) r1
            return r1
    }

    public static io.realm.Case[] values() {
            io.realm.Case[] r0 = io.realm.Case.$VALUES
            java.lang.Object r0 = r0.clone()
            io.realm.Case[] r0 = (io.realm.Case[]) r0
            return r0
    }

    public boolean getValue() {
            r1 = this;
            boolean r0 = r1.value
            return r0
    }
}
