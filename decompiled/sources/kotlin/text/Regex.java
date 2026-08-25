package kotlin.text;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 02\u00060\u0001j\u0002`\u0002:\u000201B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\u0010\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0004J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\"\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170%J\u0016\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u0016\u0010'\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bJ \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bH\u0007J\u0006\u0010,\u001a\u00020\rJ\b\u0010-\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020/H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00062"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchAt", "index", "matchEntire", "matches", "matchesAt", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "splitToSequence", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Regex implements java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.Regex.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private java.util.Set<? extends kotlin.text.RegexOption> _options;

    @org.jetbrains.annotations.NotNull
    private final java.util.regex.Pattern nativePattern;

    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ int access$ensureUnicodeCase(kotlin.text.Regex.Companion r0, int r1) {
                int r0 = r0.ensureUnicodeCase(r1)
                return r0
        }

        private final int ensureUnicodeCase(int r2) {
                r1 = this;
                r0 = r2 & 2
                if (r0 == 0) goto L6
                r2 = r2 | 64
            L6:
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String escape(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "literal"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = java.util.regex.Pattern.quote(r2)
                java.lang.String r0 = "quote(literal)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String escapeReplacement(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "literal"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = java.util.regex.Matcher.quoteReplacement(r2)
                java.lang.String r0 = "quoteReplacement(literal)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.text.Regex fromLiteral(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "literal"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                kotlin.text.Regex r0 = new kotlin.text.Regex
                kotlin.text.RegexOption r1 = kotlin.text.RegexOption.LITERAL
                r0.<init>(r3, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Serialized implements java.io.Serializable {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.text.Regex.Serialized.Companion Companion = null;
        private static final long serialVersionUID = 0;
        private final int flags;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String pattern;

        /* JADX INFO: compiled from: Regex.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                kotlin.text.Regex$Serialized$Companion r0 = new kotlin.text.Regex$Serialized$Companion
                r1 = 0
                r0.<init>(r1)
                kotlin.text.Regex.Serialized.Companion = r0
                return
        }

        public Serialized(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.pattern = r2
                r1.flags = r3
                return
        }

        private final java.lang.Object readResolve() {
                r3 = this;
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = r3.pattern
                int r2 = r3.flags
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
                java.lang.String r2 = "compile(pattern, flags)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r0.<init>(r1)
                return r0
        }

        public final int getFlags() {
                r1 = this;
                int r0 = r1.flags
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPattern() {
                r1 = this;
                java.lang.String r0 = r1.pattern
                return r0
        }
    }


    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2, reason: invalid class name */
    /* JADX INFO: compiled from: Regex.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.text.MatchResult, kotlin.text.MatchResult> {
        public static final kotlin.text.Regex.AnonymousClass2 INSTANCE = null;

        static {
                kotlin.text.Regex$findAll$2 r0 = new kotlin.text.Regex$findAll$2
                r0.<init>()
                kotlin.text.Regex.AnonymousClass2.INSTANCE = r0
                return
        }

        public AnonymousClass2() {
                r6 = this;
                java.lang.Class<kotlin.text.MatchResult> r2 = kotlin.text.MatchResult.class
                r1 = 1
                java.lang.String r3 = "next"
                java.lang.String r4 = "next()Lkotlin/text/MatchResult;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.text.MatchResult invoke(kotlin.text.MatchResult r1) {
                r0 = this;
                kotlin.text.MatchResult r1 = (kotlin.text.MatchResult) r1
                kotlin.text.MatchResult r1 = r0.invoke2(r1)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final kotlin.text.MatchResult invoke2(@org.jetbrains.annotations.NotNull kotlin.text.MatchResult r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.text.MatchResult r2 = r2.next()
                return r2
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$splitToSequence$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {276, 284, 288}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    public static final class C01131 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public final /* synthetic */ java.lang.CharSequence $input;
        public final /* synthetic */ int $limit;
        public int I$0;
        private /* synthetic */ java.lang.Object L$0;
        public java.util.regex.Matcher L$1;
        public int label;
        public final /* synthetic */ kotlin.text.Regex this$0;

        public C01131(kotlin.text.Regex r1, java.lang.CharSequence r2, int r3, kotlin.coroutines.Continuation<? super kotlin.text.Regex.C01131> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.$input = r2
                r0.$limit = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlin.text.Regex$splitToSequence$1 r0 = new kotlin.text.Regex$splitToSequence$1
                kotlin.text.Regex r1 = r4.this$0
                java.lang.CharSequence r2 = r4.$input
                int r3 = r4.$limit
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.String> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlin.sequences.SequenceScope<? super java.lang.String> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlin.text.Regex$splitToSequence$1 r1 = (kotlin.text.Regex.C01131) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 1
                r3 = 2
                r4 = 3
                r5 = 0
                if (r1 == 0) goto L31
                if (r1 == r2) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r4) goto L17
                kotlin.ResultKt.throwOnFailure(r11)
                goto L9d
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                int r1 = r10.I$0
                java.util.regex.Matcher r5 = r10.L$1
                java.lang.Object r6 = r10.L$0
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r10
                goto L71
            L2c:
                kotlin.ResultKt.throwOnFailure(r11)
                goto Laf
            L31:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
                kotlin.text.Regex r1 = r10.this$0
                java.util.regex.Pattern r1 = kotlin.text.Regex.access$getNativePattern$p(r1)
                java.lang.CharSequence r6 = r10.$input
                java.util.regex.Matcher r1 = r1.matcher(r6)
                int r6 = r10.$limit
                if (r6 == r2) goto La0
                boolean r6 = r1.find()
                if (r6 != 0) goto L4f
                goto La0
            L4f:
                r7 = r10
                r6 = r11
                r5 = r1
                r11 = 0
                r1 = 0
            L54:
                java.lang.CharSequence r8 = r7.$input
                int r9 = r5.start()
                java.lang.CharSequence r11 = r8.subSequence(r11, r9)
                java.lang.String r11 = r11.toString()
                r7.L$0 = r6
                r7.L$1 = r5
                r7.I$0 = r1
                r7.label = r3
                java.lang.Object r11 = r6.yield(r11, r7)
                if (r11 != r0) goto L71
                return r0
            L71:
                int r11 = r5.end()
                int r1 = r1 + r2
                int r8 = r7.$limit
                int r8 = r8 - r2
                if (r1 == r8) goto L81
                boolean r8 = r5.find()
                if (r8 != 0) goto L54
            L81:
                java.lang.CharSequence r1 = r7.$input
                int r2 = r1.length()
                java.lang.CharSequence r11 = r1.subSequence(r11, r2)
                java.lang.String r11 = r11.toString()
                r1 = 0
                r7.L$0 = r1
                r7.L$1 = r1
                r7.label = r4
                java.lang.Object r11 = r6.yield(r11, r7)
                if (r11 != r0) goto L9d
                return r0
            L9d:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            La0:
                java.lang.CharSequence r1 = r10.$input
                java.lang.String r1 = r1.toString()
                r10.label = r2
                java.lang.Object r11 = r11.yield(r1, r10)
                if (r11 != r0) goto Laf
                return r0
            Laf:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    static {
            kotlin.text.Regex$Companion r0 = new kotlin.text.Regex$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.text.Regex.Companion = r0
            return
    }

    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
    }

    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Set<? extends kotlin.text.RegexOption> r3) {
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.Regex$Companion r0 = kotlin.text.Regex.Companion
            int r3 = kotlin.text.RegexKt.access$toInt(r3)
            int r3 = kotlin.text.Regex.Companion.access$ensureUnicodeCase(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r2)
            return
    }

    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.RegexOption r3) {
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.Regex$Companion r0 = kotlin.text.Regex.Companion
            int r3 = r3.getValue()
            int r3 = kotlin.text.Regex.Companion.access$ensureUnicodeCase(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r2)
            return
    }

    @kotlin.PublishedApi
    public Regex(@org.jetbrains.annotations.NotNull java.util.regex.Pattern r2) {
            r1 = this;
            java.lang.String r0 = "nativePattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.nativePattern = r2
            return
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getNativePattern$p(kotlin.text.Regex r0) {
            java.util.regex.Pattern r0 = r0.nativePattern
            return r0
    }

    public static /* synthetic */ kotlin.text.MatchResult find$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.text.MatchResult r0 = r0.find(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.sequences.Sequence findAll$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.sequences.Sequence r0 = r0.findAll(r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List split$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.util.List r0 = r0.split(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.sequences.Sequence r0 = r0.splitToSequence(r1, r2)
            return r0
    }

    private final java.lang.Object writeReplace() {
            r3 = this;
            kotlin.text.Regex$Serialized r0 = new kotlin.text.Regex$Serialized
            java.util.regex.Pattern r1 = r3.nativePattern
            java.lang.String r1 = r1.pattern()
            java.lang.String r2 = "nativePattern.pattern()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.util.regex.Pattern r2 = r3.nativePattern
            int r2 = r2.flags()
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean containsMatchIn(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.find()
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.text.MatchResult find(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            java.lang.String r1 = "nativePattern.matcher(input)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.MatchResult r3 = kotlin.text.RegexKt.access$findNext(r0, r4, r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.sequences.Sequence<kotlin.text.MatchResult> findAll(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, int r5) {
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 < 0) goto L19
            int r0 = r4.length()
            if (r5 > r0) goto L19
            kotlin.text.Regex$findAll$1 r0 = new kotlin.text.Regex$findAll$1
            r0.<init>(r3, r4, r5)
            kotlin.text.Regex$findAll$2 r4 = kotlin.text.Regex.AnonymousClass2.INSTANCE
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.generateSequence(r0, r4)
            return r4
        L19:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Start index out of bounds: "
            java.lang.String r2 = ", input length: "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r5, r2)
            int r4 = r4.length()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.<init>(r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<kotlin.text.RegexOption> getOptions() {
            r3 = this;
            java.util.Set<? extends kotlin.text.RegexOption> r0 = r3._options
            if (r0 != 0) goto L29
            java.util.regex.Pattern r0 = r3.nativePattern
            int r0 = r0.flags()
            java.lang.Class<kotlin.text.RegexOption> r1 = kotlin.text.RegexOption.class
            java.util.EnumSet r1 = java.util.EnumSet.allOf(r1)
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            kotlin.text.Regex$special$$inlined$fromInt$1 r2 = new kotlin.text.Regex$special$$inlined$fromInt$1
            r2.<init>(r0)
            kotlin.collections.CollectionsKt.retainAll(r1, r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r1)
            java.lang.String r1 = "unmodifiableSet(EnumSet.…mask == it.value }\n    })"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r3._options = r0
        L29:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPattern() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.nativePattern
            java.lang.String r0 = r0.pattern()
            java.lang.String r1 = "nativePattern.pattern()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.Nullable
    public final kotlin.text.MatchResult matchAt(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r1 = 0
            java.util.regex.Matcher r0 = r0.useAnchoringBounds(r1)
            r1 = 1
            java.util.regex.Matcher r0 = r0.useTransparentBounds(r1)
            int r1 = r3.length()
            java.util.regex.Matcher r4 = r0.region(r4, r1)
            boolean r0 = r4.lookingAt()
            if (r0 == 0) goto L2f
            kotlin.text.MatcherMatchResult r0 = new kotlin.text.MatcherMatchResult
            java.lang.String r1 = "this"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r0.<init>(r4, r3)
            goto L30
        L2f:
            r0 = 0
        L30:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.text.MatchResult matchEntire(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            java.lang.String r1 = "nativePattern.matcher(input)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.MatchResult r3 = kotlin.text.RegexKt.access$matchEntire(r0, r3)
            return r3
    }

    public final boolean matches(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.matches()
            return r2
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    public final boolean matchesAt(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r1 = 0
            java.util.regex.Matcher r0 = r0.useAnchoringBounds(r1)
            r1 = 1
            java.util.regex.Matcher r0 = r0.useTransparentBounds(r1)
            int r3 = r3.length()
            java.util.regex.Matcher r3 = r0.region(r4, r3)
            boolean r3 = r3.lookingAt()
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String replace(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r3)
            java.lang.String r3 = "nativePattern.matcher(in…).replaceAll(replacement)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String replace(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.text.MatchResult, ? extends java.lang.CharSequence> r7) {
            r5 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            kotlin.text.MatchResult r1 = find$default(r5, r6, r0, r1, r2)
            if (r1 != 0) goto L19
            java.lang.String r6 = r6.toString()
            return r6
        L19:
            int r2 = r6.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
        L22:
            kotlin.ranges.IntRange r4 = r1.getRange()
            java.lang.Integer r4 = r4.getStart()
            int r4 = r4.intValue()
            r3.append(r6, r0, r4)
            java.lang.Object r0 = r7.invoke(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            kotlin.ranges.IntRange r0 = r1.getRange()
            java.lang.Integer r0 = r0.getEndInclusive()
            int r0 = r0.intValue()
            int r0 = r0 + 1
            kotlin.text.MatchResult r1 = r1.next()
            if (r0 >= r2) goto L50
            if (r1 != 0) goto L22
        L50:
            if (r0 >= r2) goto L55
            r3.append(r6, r0, r2)
        L55:
            java.lang.String r6 = r3.toString()
            java.lang.String r7 = "sb.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String replaceFirst(@org.jetbrains.annotations.NotNull java.lang.CharSequence r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceFirst(r3)
            java.lang.String r3 = "nativePattern.matcher(in…replaceFirst(replacement)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> split(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, int r6) {
            r4 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.text.StringsKt__StringsKt.requireNonNegativeLimit(r6)
            java.util.regex.Pattern r0 = r4.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r5)
            r1 = 1
            if (r6 == r1) goto L58
            boolean r2 = r0.find()
            if (r2 != 0) goto L18
            goto L58
        L18:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            if (r6 <= 0) goto L22
            int r3 = kotlin.ranges.RangesKt.coerceAtMost(r6, r3)
        L22:
            r2.<init>(r3)
            r3 = 0
            int r6 = r6 - r1
        L27:
            int r1 = r0.start()
            java.lang.CharSequence r1 = r5.subSequence(r3, r1)
            java.lang.String r1 = r1.toString()
            r2.add(r1)
            int r3 = r0.end()
            if (r6 < 0) goto L42
            int r1 = r2.size()
            if (r1 == r6) goto L48
        L42:
            boolean r1 = r0.find()
            if (r1 != 0) goto L27
        L48:
            int r6 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r3, r6)
            java.lang.String r5 = r5.toString()
            r2.add(r5)
            return r2
        L58:
            java.lang.String r5 = r5.toString()
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r5)
            return r5
    }

    @kotlin.SinceKotlin(version = "1.6")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
    @org.jetbrains.annotations.NotNull
    public final kotlin.sequences.Sequence<java.lang.String> splitToSequence(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.StringsKt__StringsKt.requireNonNegativeLimit(r4)
            kotlin.text.Regex$splitToSequence$1 r0 = new kotlin.text.Regex$splitToSequence$1
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.sequence(r0)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.regex.Pattern toPattern() {
            r1 = this;
            java.util.regex.Pattern r0 = r1.nativePattern
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.nativePattern
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "nativePattern.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
