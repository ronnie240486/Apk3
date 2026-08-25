package kotlin.text;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__IndentKt extends kotlin.text.StringsKt__AppendableKt {


    public StringsKt__IndentKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> getIndentFunction$StringsKt__IndentKt(java.lang.String r1) {
            int r0 = r1.length()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Le
            kotlin.text.StringsKt__IndentKt$getIndentFunction$1 r1 = kotlin.text.StringsKt__IndentKt$getIndentFunction$1.INSTANCE
            goto L14
        Le:
            kotlin.text.StringsKt__IndentKt$getIndentFunction$2 r0 = new kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            r0.<init>(r1)
            r1 = r0
        L14:
            return r1
    }

    private static final int indentWidth$StringsKt__IndentKt(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            r2 = -1
            if (r1 >= r0) goto L18
            char r3 = r4.charAt(r1)
            boolean r3 = kotlin.text.CharsKt__CharJVMKt.isWhitespace(r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L15
            goto L19
        L15:
            int r1 = r1 + 1
            goto L5
        L18:
            r1 = -1
        L19:
            if (r1 != r2) goto L1f
            int r1 = r4.length()
        L1f:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String prependIndent(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "indent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.sequences.Sequence r1 = kotlin.text.StringsKt__StringsKt.lineSequence(r1)
            kotlin.text.StringsKt__IndentKt$prependIndent$1 r0 = new kotlin.text.StringsKt__IndentKt$prependIndent$1
            r0.<init>(r2)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.map(r1, r0)
            java.lang.String r2 = "\n"
            java.lang.String r1 = kotlin.sequences.SequencesKt.joinToString$default(r1, r2)
            return r1
    }

    public static /* synthetic */ java.lang.String prependIndent$default(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "    "
        L6:
            java.lang.String r0 = prependIndent(r0, r1)
            return r0
    }

    private static final java.lang.String reindent$StringsKt__IndentKt(java.util.List<java.lang.String> r5, int r6, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r7, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r8) {
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        Le:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r5.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L1f
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L1f:
            java.lang.String r3 = (java.lang.String) r3
            if (r2 == 0) goto L25
            if (r2 != r0) goto L2d
        L25:
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r3)
            if (r2 == 0) goto L2d
            r3 = 0
            goto L3f
        L2d:
            java.lang.Object r2 = r8.invoke(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L3e
            goto L3f
        L3e:
            r3 = r2
        L3f:
            if (r3 == 0) goto L44
            r1.add(r3)
        L44:
            r2 = r4
            goto Le
        L46:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.String r6 = "\n"
            java.lang.Appendable r5 = kotlin.collections.CollectionsKt.joinTo$default(r1, r5, r6)
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceIndent(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.List r0 = kotlin.text.StringsKt__StringsKt.lines(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L17
            r1.add(r3)
            goto L17
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = indentWidth$StringsKt__IndentKt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L3d
        L55:
            java.lang.Comparable r1 = kotlin.collections.CollectionsKt.minOrNull(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L63
            int r1 = r1.intValue()
            goto L64
        L63:
            r1 = 0
        L64:
            int r7 = r7.length()
            int r3 = r8.length()
            int r4 = r0.size()
            int r4 = r4 * r3
            int r4 = r4 + r7
            kotlin.jvm.functions.Function1 r7 = getIndentFunction$StringsKt__IndentKt(r8)
            int r8 = kotlin.collections.CollectionsKt.getLastIndex(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L84:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lba
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L95
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L95:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L9b
            if (r2 != r8) goto La3
        L9b:
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r5)
            if (r2 == 0) goto La3
            r5 = 0
            goto Lb3
        La3:
            java.lang.String r2 = kotlin.text.StringsKt___StringsKt.drop(r5, r1)
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lb2
            goto Lb3
        Lb2:
            r5 = r2
        Lb3:
            if (r5 == 0) goto Lb8
            r3.add(r5)
        Lb8:
            r2 = r6
            goto L84
        Lba:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            java.lang.String r8 = "\n"
            java.lang.Appendable r7 = kotlin.collections.CollectionsKt.joinTo$default(r3, r7, r8)
            java.lang.StringBuilder r7 = (java.lang.StringBuilder) r7
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
    }

    public static /* synthetic */ java.lang.String replaceIndent$default(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            java.lang.String r0 = replaceIndent(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String replaceIndentByMargin(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20) {
            java.lang.String r0 = "<this>"
            r1 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "newIndent"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "marginPrefix"
            r7 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r20)
            r0 = r0 ^ 1
            if (r0 == 0) goto Ld3
            java.util.List r0 = kotlin.text.StringsKt__StringsKt.lines(r18)
            int r1 = r18.length()
            int r3 = r19.length()
            int r4 = r0.size()
            int r4 = r4 * r3
            int r8 = r4 + r1
            kotlin.jvm.functions.Function1 r9 = getIndentFunction$StringsKt__IndentKt(r19)
            int r10 = kotlin.collections.CollectionsKt.getLastIndex(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
            r12 = 0
            r1 = 0
        L44:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r0.next()
            int r13 = r1 + 1
            if (r1 >= 0) goto L55
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L55:
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            if (r1 == 0) goto L5d
            if (r1 != r10) goto L65
        L5d:
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r14)
            if (r1 == 0) goto L65
            r14 = r15
            goto Lb5
        L65:
            int r1 = r14.length()
            r2 = 0
        L6a:
            r3 = -1
            if (r2 >= r1) goto L7e
            char r4 = r14.charAt(r2)
            boolean r4 = kotlin.text.CharsKt__CharJVMKt.isWhitespace(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L7b
            r6 = r2
            goto L7f
        L7b:
            int r2 = r2 + 1
            goto L6a
        L7e:
            r6 = -1
        L7f:
            if (r6 != r3) goto L82
            goto La9
        L82:
            r4 = 0
            r5 = 4
            r16 = 0
            r1 = r14
            r2 = r20
            r3 = r6
            r17 = r6
            r6 = r16
            boolean r1 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto La9
            int r1 = r20.length()
            int r1 = r1 + r17
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14, r2)
            java.lang.String r15 = r14.substring(r1)
            java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
        La9:
            if (r15 == 0) goto Lb5
            java.lang.Object r1 = r9.invoke(r15)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Lb4
            goto Lb5
        Lb4:
            r14 = r1
        Lb5:
            if (r14 == 0) goto Lba
            r11.add(r14)
        Lba:
            r1 = r13
            goto L44
        Lbc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.String r1 = "\n"
            java.lang.Appendable r0 = kotlin.collections.CollectionsKt.joinTo$default(r11, r0, r1)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        Ld3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "marginPrefix must be non-blank string."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.String replaceIndentByMargin$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            java.lang.String r2 = "|"
        Ld:
            java.lang.String r0 = replaceIndentByMargin(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String trimIndent(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = replaceIndent(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String trimMargin(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "marginPrefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = replaceIndentByMargin(r1, r0, r2)
            return r1
    }

    public static /* synthetic */ java.lang.String trimMargin$default(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L7
            java.lang.String r1 = "|"
        L7:
            java.lang.String r0 = trimMargin(r0, r1)
            return r0
    }
}
