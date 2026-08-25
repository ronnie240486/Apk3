package com.google.common.io;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final enum FileWriteMode extends java.lang.Enum<com.google.common.io.FileWriteMode> {
    private static final /* synthetic */ com.google.common.io.FileWriteMode[] $VALUES = null;
    public static final com.google.common.io.FileWriteMode APPEND = null;

    private static /* synthetic */ com.google.common.io.FileWriteMode[] $values() {
            r0 = 1
            com.google.common.io.FileWriteMode[] r0 = new com.google.common.io.FileWriteMode[r0]
            com.google.common.io.FileWriteMode r1 = com.google.common.io.FileWriteMode.APPEND
            r2 = 0
            r0[r2] = r1
            return r0
    }

    static {
            com.google.common.io.FileWriteMode r0 = new com.google.common.io.FileWriteMode
            java.lang.String r1 = "APPEND"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.io.FileWriteMode.APPEND = r0
            com.google.common.io.FileWriteMode[] r0 = $values()
            com.google.common.io.FileWriteMode.$VALUES = r0
            return
    }

    private FileWriteMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.common.io.FileWriteMode valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.io.FileWriteMode> r0 = com.google.common.io.FileWriteMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.io.FileWriteMode r1 = (com.google.common.io.FileWriteMode) r1
            return r1
    }

    public static com.google.common.io.FileWriteMode[] values() {
            com.google.common.io.FileWriteMode[] r0 = com.google.common.io.FileWriteMode.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.io.FileWriteMode[] r0 = (com.google.common.io.FileWriteMode[]) r0
            return r0
    }
}
