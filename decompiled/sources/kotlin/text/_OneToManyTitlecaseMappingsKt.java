package kotlin.text;

/* JADX INFO: compiled from: _OneToManyTitlecaseMappings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class _OneToManyTitlecaseMappingsKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String titlecaseImpl(char r5) {
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            java.lang.String r3 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r3 = r0.length()
            r4 = 1
            if (r3 <= r4) goto L50
            r3 = 329(0x149, float:4.61E-43)
            if (r5 != r3) goto L21
            goto L4f
        L21:
            r5 = 0
            char r5 = r0.charAt(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r0 = r0.substring(r4)
            java.lang.String r3 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L4f:
            return r0
        L50:
            char r5 = java.lang.Character.toTitleCase(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
    }
}
