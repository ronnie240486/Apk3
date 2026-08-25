package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineName.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/CoroutineName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CoroutineName extends kotlin.coroutines.AbstractCoroutineContextElement {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineName.Key Key = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    /* JADX INFO: compiled from: CoroutineName.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineName$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineName;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineName> {
        private Key() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Key(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.CoroutineName$Key r0 = new kotlinx.coroutines.CoroutineName$Key
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.CoroutineName.Key = r0
            return
    }

    public CoroutineName(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            kotlinx.coroutines.CoroutineName$Key r0 = kotlinx.coroutines.CoroutineName.Key
            r1.<init>(r0)
            r1.name = r2
            return
    }

    public static /* synthetic */ kotlinx.coroutines.CoroutineName copy$default(kotlinx.coroutines.CoroutineName r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.name
        L6:
            kotlinx.coroutines.CoroutineName r0 = r0.copy(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineName copy(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            kotlinx.coroutines.CoroutineName r0 = new kotlinx.coroutines.CoroutineName
            r0.<init>(r2)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof kotlinx.coroutines.CoroutineName
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.CoroutineName r4 = (kotlinx.coroutines.CoroutineName) r4
            java.lang.String r1 = r3.name
            java.lang.String r4 = r4.name
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.name
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CoroutineName("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.name
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
