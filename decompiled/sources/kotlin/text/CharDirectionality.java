package kotlin.text;

/* JADX INFO: compiled from: CharDirectionality.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lkotlin/text/CharDirectionality;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final enum CharDirectionality extends java.lang.Enum<kotlin.text.CharDirectionality> {
    private static final /* synthetic */ kotlin.text.CharDirectionality[] $VALUES = null;
    public static final kotlin.text.CharDirectionality ARABIC_NUMBER = null;
    public static final kotlin.text.CharDirectionality BOUNDARY_NEUTRAL = null;
    public static final kotlin.text.CharDirectionality COMMON_NUMBER_SEPARATOR = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.text.CharDirectionality.Companion Companion = null;
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER = null;
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER_SEPARATOR = null;
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER_TERMINATOR = null;
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT = null;
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT_EMBEDDING = null;
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT_OVERRIDE = null;
    public static final kotlin.text.CharDirectionality NONSPACING_MARK = null;
    public static final kotlin.text.CharDirectionality OTHER_NEUTRALS = null;
    public static final kotlin.text.CharDirectionality PARAGRAPH_SEPARATOR = null;
    public static final kotlin.text.CharDirectionality POP_DIRECTIONAL_FORMAT = null;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT = null;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_ARABIC = null;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_EMBEDDING = null;
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_OVERRIDE = null;
    public static final kotlin.text.CharDirectionality SEGMENT_SEPARATOR = null;
    public static final kotlin.text.CharDirectionality UNDEFINED = null;
    public static final kotlin.text.CharDirectionality WHITESPACE = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality>> directionalityMap$delegate = null;
    private final int value;

    /* JADX INFO: compiled from: CharDirectionality.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/text/CharDirectionality$Companion;", "", "()V", "directionalityMap", "", "", "Lkotlin/text/CharDirectionality;", "getDirectionalityMap", "()Ljava/util/Map;", "directionalityMap$delegate", "Lkotlin/Lazy;", "valueOf", "directionality", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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

        private final java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality> getDirectionalityMap() {
                r1 = this;
                kotlin.Lazy r0 = kotlin.text.CharDirectionality.access$getDirectionalityMap$delegate$cp()
                java.lang.Object r0 = r0.getValue()
                java.util.Map r0 = (java.util.Map) r0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.text.CharDirectionality valueOf(int r4) {
                r3 = this;
                java.util.Map r0 = r3.getDirectionalityMap()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r1)
                kotlin.text.CharDirectionality r0 = (kotlin.text.CharDirectionality) r0
                if (r0 == 0) goto L11
                return r0
            L11:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Directionality #"
                java.lang.String r2 = " is not defined."
                java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r2)
                r0.<init>(r4)
                throw r0
        }
    }

    private static final /* synthetic */ kotlin.text.CharDirectionality[] $values() {
            r0 = 20
            kotlin.text.CharDirectionality[] r0 = new kotlin.text.CharDirectionality[r0]
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.UNDEFINED
            r2 = 0
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.LEFT_TO_RIGHT
            r2 = 1
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.RIGHT_TO_LEFT
            r2 = 2
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.RIGHT_TO_LEFT_ARABIC
            r2 = 3
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.EUROPEAN_NUMBER
            r2 = 4
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.EUROPEAN_NUMBER_SEPARATOR
            r2 = 5
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.EUROPEAN_NUMBER_TERMINATOR
            r2 = 6
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.ARABIC_NUMBER
            r2 = 7
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.COMMON_NUMBER_SEPARATOR
            r2 = 8
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.NONSPACING_MARK
            r2 = 9
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.BOUNDARY_NEUTRAL
            r2 = 10
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.PARAGRAPH_SEPARATOR
            r2 = 11
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.SEGMENT_SEPARATOR
            r2 = 12
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.WHITESPACE
            r2 = 13
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.OTHER_NEUTRALS
            r2 = 14
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.LEFT_TO_RIGHT_EMBEDDING
            r2 = 15
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.LEFT_TO_RIGHT_OVERRIDE
            r2 = 16
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.RIGHT_TO_LEFT_EMBEDDING
            r2 = 17
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.RIGHT_TO_LEFT_OVERRIDE
            r2 = 18
            r0[r2] = r1
            kotlin.text.CharDirectionality r1 = kotlin.text.CharDirectionality.POP_DIRECTIONAL_FORMAT
            r2 = 19
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "UNDEFINED"
            r2 = 0
            r3 = -1
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.UNDEFINED = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "LEFT_TO_RIGHT"
            r3 = 1
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.LEFT_TO_RIGHT = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "RIGHT_TO_LEFT"
            r2 = 2
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.RIGHT_TO_LEFT = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "RIGHT_TO_LEFT_ARABIC"
            r3 = 3
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.RIGHT_TO_LEFT_ARABIC = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "EUROPEAN_NUMBER"
            r2 = 4
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.EUROPEAN_NUMBER = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "EUROPEAN_NUMBER_SEPARATOR"
            r3 = 5
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.EUROPEAN_NUMBER_SEPARATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "EUROPEAN_NUMBER_TERMINATOR"
            r2 = 6
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.EUROPEAN_NUMBER_TERMINATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "ARABIC_NUMBER"
            r3 = 7
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.ARABIC_NUMBER = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "COMMON_NUMBER_SEPARATOR"
            r2 = 8
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.COMMON_NUMBER_SEPARATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "NONSPACING_MARK"
            r3 = 9
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.NONSPACING_MARK = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "BOUNDARY_NEUTRAL"
            r2 = 10
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.BOUNDARY_NEUTRAL = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "PARAGRAPH_SEPARATOR"
            r3 = 11
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.PARAGRAPH_SEPARATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "SEGMENT_SEPARATOR"
            r2 = 12
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.SEGMENT_SEPARATOR = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "WHITESPACE"
            r3 = 13
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.WHITESPACE = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "OTHER_NEUTRALS"
            r2 = 14
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.OTHER_NEUTRALS = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "LEFT_TO_RIGHT_EMBEDDING"
            r3 = 15
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.LEFT_TO_RIGHT_EMBEDDING = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "LEFT_TO_RIGHT_OVERRIDE"
            r2 = 16
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.LEFT_TO_RIGHT_OVERRIDE = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "RIGHT_TO_LEFT_EMBEDDING"
            r3 = 17
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.RIGHT_TO_LEFT_EMBEDDING = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "RIGHT_TO_LEFT_OVERRIDE"
            r2 = 18
            r0.<init>(r1, r2, r3)
            kotlin.text.CharDirectionality.RIGHT_TO_LEFT_OVERRIDE = r0
            kotlin.text.CharDirectionality r0 = new kotlin.text.CharDirectionality
            java.lang.String r1 = "POP_DIRECTIONAL_FORMAT"
            r3 = 19
            r0.<init>(r1, r3, r2)
            kotlin.text.CharDirectionality.POP_DIRECTIONAL_FORMAT = r0
            kotlin.text.CharDirectionality[] r0 = $values()
            kotlin.text.CharDirectionality.$VALUES = r0
            kotlin.text.CharDirectionality$Companion r0 = new kotlin.text.CharDirectionality$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.text.CharDirectionality.Companion = r0
            kotlin.text.CharDirectionality$Companion$directionalityMap$2 r0 = kotlin.text.CharDirectionality$Companion$directionalityMap$2.INSTANCE
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            kotlin.text.CharDirectionality.directionalityMap$delegate = r0
            return
    }

    private CharDirectionality(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static final /* synthetic */ kotlin.Lazy access$getDirectionalityMap$delegate$cp() {
            kotlin.Lazy<java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality>> r0 = kotlin.text.CharDirectionality.directionalityMap$delegate
            return r0
    }

    public static kotlin.text.CharDirectionality valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.text.CharDirectionality> r0 = kotlin.text.CharDirectionality.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.text.CharDirectionality r1 = (kotlin.text.CharDirectionality) r1
            return r1
    }

    public static kotlin.text.CharDirectionality[] values() {
            kotlin.text.CharDirectionality[] r0 = kotlin.text.CharDirectionality.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.text.CharDirectionality[] r0 = (kotlin.text.CharDirectionality[]) r0
            return r0
    }

    public final int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
