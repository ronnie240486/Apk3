package androidx.core.content;

/* JADX INFO: compiled from: ContentValues.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"contentValuesOf", "Landroid/content/ContentValues;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ContentValuesKt {
    @org.jetbrains.annotations.NotNull
    public static final android.content.ContentValues contentValuesOf(@org.jetbrains.annotations.NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r6) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.ContentValues r0 = new android.content.ContentValues
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto La9
            r3 = r6[r2]
            java.lang.Object r4 = r3.component1()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.component2()
            if (r3 != 0) goto L21
            r0.putNull(r4)
            goto L7a
        L21:
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L2b
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r4, r3)
            goto L7a
        L2b:
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L35
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0.put(r4, r3)
            goto L7a
        L35:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L3f
            java.lang.Long r3 = (java.lang.Long) r3
            r0.put(r4, r3)
            goto L7a
        L3f:
            boolean r5 = r3 instanceof java.lang.Boolean
            if (r5 == 0) goto L49
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r0.put(r4, r3)
            goto L7a
        L49:
            boolean r5 = r3 instanceof java.lang.Float
            if (r5 == 0) goto L53
            java.lang.Float r3 = (java.lang.Float) r3
            r0.put(r4, r3)
            goto L7a
        L53:
            boolean r5 = r3 instanceof java.lang.Double
            if (r5 == 0) goto L5d
            java.lang.Double r3 = (java.lang.Double) r3
            r0.put(r4, r3)
            goto L7a
        L5d:
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L67
            byte[] r3 = (byte[]) r3
            r0.put(r4, r3)
            goto L7a
        L67:
            boolean r5 = r3 instanceof java.lang.Byte
            if (r5 == 0) goto L71
            java.lang.Byte r3 = (java.lang.Byte) r3
            r0.put(r4, r3)
            goto L7a
        L71:
            boolean r5 = r3 instanceof java.lang.Short
            if (r5 == 0) goto L7d
            java.lang.Short r3 = (java.lang.Short) r3
            r0.put(r4, r3)
        L7a:
            int r2 = r2 + 1
            goto Ld
        L7d:
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal value type "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " for key \""
            r1.append(r6)
            r1.append(r4)
            r6 = 34
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        La9:
            return r0
    }
}
