package com.google.thirdparty.publicsuffix;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
public final enum PublicSuffixType extends java.lang.Enum<com.google.thirdparty.publicsuffix.PublicSuffixType> {
    private static final /* synthetic */ com.google.thirdparty.publicsuffix.PublicSuffixType[] $VALUES = null;
    public static final com.google.thirdparty.publicsuffix.PublicSuffixType PRIVATE = null;
    public static final com.google.thirdparty.publicsuffix.PublicSuffixType REGISTRY = null;
    private final char innerNodeCode;
    private final char leafNodeCode;

    private static /* synthetic */ com.google.thirdparty.publicsuffix.PublicSuffixType[] $values() {
            r0 = 2
            com.google.thirdparty.publicsuffix.PublicSuffixType[] r0 = new com.google.thirdparty.publicsuffix.PublicSuffixType[r0]
            com.google.thirdparty.publicsuffix.PublicSuffixType r1 = com.google.thirdparty.publicsuffix.PublicSuffixType.PRIVATE
            r2 = 0
            r0[r2] = r1
            com.google.thirdparty.publicsuffix.PublicSuffixType r1 = com.google.thirdparty.publicsuffix.PublicSuffixType.REGISTRY
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            com.google.thirdparty.publicsuffix.PublicSuffixType r0 = new com.google.thirdparty.publicsuffix.PublicSuffixType
            java.lang.String r1 = "PRIVATE"
            r2 = 0
            r3 = 58
            r4 = 44
            r0.<init>(r1, r2, r3, r4)
            com.google.thirdparty.publicsuffix.PublicSuffixType.PRIVATE = r0
            com.google.thirdparty.publicsuffix.PublicSuffixType r0 = new com.google.thirdparty.publicsuffix.PublicSuffixType
            java.lang.String r1 = "REGISTRY"
            r2 = 1
            r3 = 33
            r4 = 63
            r0.<init>(r1, r2, r3, r4)
            com.google.thirdparty.publicsuffix.PublicSuffixType.REGISTRY = r0
            com.google.thirdparty.publicsuffix.PublicSuffixType[] r0 = $values()
            com.google.thirdparty.publicsuffix.PublicSuffixType.$VALUES = r0
            return
    }

    private PublicSuffixType(java.lang.String r1, int r2, char r3, char r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.innerNodeCode = r3
            r0.leafNodeCode = r4
            return
    }

    public static com.google.thirdparty.publicsuffix.PublicSuffixType fromCode(char r5) {
            com.google.thirdparty.publicsuffix.PublicSuffixType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L17
            r3 = r0[r2]
            char r4 = r3.innerNodeCode
            if (r4 == r5) goto L16
            char r4 = r3.leafNodeCode
            if (r4 != r5) goto L13
            goto L16
        L13:
            int r2 = r2 + 1
            goto L6
        L16:
            return r3
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "No enum corresponding to given code: "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
    }

    public static com.google.thirdparty.publicsuffix.PublicSuffixType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.thirdparty.publicsuffix.PublicSuffixType> r0 = com.google.thirdparty.publicsuffix.PublicSuffixType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.thirdparty.publicsuffix.PublicSuffixType r1 = (com.google.thirdparty.publicsuffix.PublicSuffixType) r1
            return r1
    }

    public static com.google.thirdparty.publicsuffix.PublicSuffixType[] values() {
            com.google.thirdparty.publicsuffix.PublicSuffixType[] r0 = com.google.thirdparty.publicsuffix.PublicSuffixType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.thirdparty.publicsuffix.PublicSuffixType[] r0 = (com.google.thirdparty.publicsuffix.PublicSuffixType[]) r0
            return r0
    }
}
