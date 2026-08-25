package kotlinx.android.extensions;

/* JADX INFO: compiled from: CacheImplementation.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "(Ljava/lang/String;I)V", "SPARSE_ARRAY", "HASH_MAP", "NO_CACHE", "Companion", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final enum CacheImplementation extends java.lang.Enum<kotlinx.android.extensions.CacheImplementation> {
    private static final /* synthetic */ kotlinx.android.extensions.CacheImplementation[] $VALUES = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.android.extensions.CacheImplementation.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.android.extensions.CacheImplementation DEFAULT = null;
    public static final kotlinx.android.extensions.CacheImplementation HASH_MAP = null;
    public static final kotlinx.android.extensions.CacheImplementation NO_CACHE = null;
    public static final kotlinx.android.extensions.CacheImplementation SPARSE_ARRAY = null;

    /* JADX INFO: compiled from: CacheImplementation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation$Companion;", "", "()V", "DEFAULT", "Lkotlinx/android/extensions/CacheImplementation;", "getDEFAULT", "()Lkotlinx/android/extensions/CacheImplementation;", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 7, 1}, xi = 48)
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

        @org.jetbrains.annotations.NotNull
        public final kotlinx.android.extensions.CacheImplementation getDEFAULT() {
                r1 = this;
                kotlinx.android.extensions.CacheImplementation r0 = kotlinx.android.extensions.CacheImplementation.access$getDEFAULT$cp()
                return r0
        }
    }

    private static final /* synthetic */ kotlinx.android.extensions.CacheImplementation[] $values() {
            r0 = 3
            kotlinx.android.extensions.CacheImplementation[] r0 = new kotlinx.android.extensions.CacheImplementation[r0]
            kotlinx.android.extensions.CacheImplementation r1 = kotlinx.android.extensions.CacheImplementation.SPARSE_ARRAY
            r2 = 0
            r0[r2] = r1
            kotlinx.android.extensions.CacheImplementation r1 = kotlinx.android.extensions.CacheImplementation.HASH_MAP
            r2 = 1
            r0[r2] = r1
            kotlinx.android.extensions.CacheImplementation r1 = kotlinx.android.extensions.CacheImplementation.NO_CACHE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.android.extensions.CacheImplementation r0 = new kotlinx.android.extensions.CacheImplementation
            java.lang.String r1 = "SPARSE_ARRAY"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.android.extensions.CacheImplementation.SPARSE_ARRAY = r0
            kotlinx.android.extensions.CacheImplementation r0 = new kotlinx.android.extensions.CacheImplementation
            java.lang.String r1 = "HASH_MAP"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.android.extensions.CacheImplementation.HASH_MAP = r0
            kotlinx.android.extensions.CacheImplementation r1 = new kotlinx.android.extensions.CacheImplementation
            java.lang.String r2 = "NO_CACHE"
            r3 = 2
            r1.<init>(r2, r3)
            kotlinx.android.extensions.CacheImplementation.NO_CACHE = r1
            kotlinx.android.extensions.CacheImplementation[] r1 = $values()
            kotlinx.android.extensions.CacheImplementation.$VALUES = r1
            kotlinx.android.extensions.CacheImplementation$Companion r1 = new kotlinx.android.extensions.CacheImplementation$Companion
            r2 = 0
            r1.<init>(r2)
            kotlinx.android.extensions.CacheImplementation.Companion = r1
            kotlinx.android.extensions.CacheImplementation.DEFAULT = r0
            return
    }

    private CacheImplementation(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ kotlinx.android.extensions.CacheImplementation access$getDEFAULT$cp() {
            kotlinx.android.extensions.CacheImplementation r0 = kotlinx.android.extensions.CacheImplementation.DEFAULT
            return r0
    }

    public static kotlinx.android.extensions.CacheImplementation valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.android.extensions.CacheImplementation> r0 = kotlinx.android.extensions.CacheImplementation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.android.extensions.CacheImplementation r1 = (kotlinx.android.extensions.CacheImplementation) r1
            return r1
    }

    public static kotlinx.android.extensions.CacheImplementation[] values() {
            kotlinx.android.extensions.CacheImplementation[] r0 = kotlinx.android.extensions.CacheImplementation.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.android.extensions.CacheImplementation[] r0 = (kotlinx.android.extensions.CacheImplementation[]) r0
            return r0
    }
}
