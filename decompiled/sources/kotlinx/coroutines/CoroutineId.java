package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
public final class CoroutineId extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.ThreadContextElement<java.lang.String> {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.CoroutineId.Key Key = null;
    private final long id;

    /* JADX INFO: compiled from: CoroutineContext.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineId> {
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
            kotlinx.coroutines.CoroutineId$Key r0 = new kotlinx.coroutines.CoroutineId$Key
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.CoroutineId.Key = r0
            return
    }

    public CoroutineId(long r2) {
            r1 = this;
            kotlinx.coroutines.CoroutineId$Key r0 = kotlinx.coroutines.CoroutineId.Key
            r1.<init>(r0)
            r1.id = r2
            return
    }

    public static /* synthetic */ kotlinx.coroutines.CoroutineId copy$default(kotlinx.coroutines.CoroutineId r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            long r1 = r0.id
        L6:
            kotlinx.coroutines.CoroutineId r0 = r0.copy(r1)
            return r0
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineId copy(long r2) {
            r1 = this;
            kotlinx.coroutines.CoroutineId r0 = new kotlinx.coroutines.CoroutineId
            r0.<init>(r2)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof kotlinx.coroutines.CoroutineId
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.CoroutineId r8 = (kotlinx.coroutines.CoroutineId) r8
            long r3 = r7.id
            long r5 = r8.id
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L15
            return r2
        L15:
            return r0
    }

    public final long getId() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.id
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ void restoreThreadContext(kotlin.coroutines.CoroutineContext r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            r0.restoreThreadContext2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: restoreThreadContext, reason: avoid collision after fix types in other method */
    public void restoreThreadContext2(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            r0 = this;
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.setName(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CoroutineId("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.id
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ java.lang.String updateThreadContext(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            java.lang.String r1 = r0.updateThreadContext2(r1)
            return r1
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: updateThreadContext, reason: avoid collision after fix types in other method */
    public java.lang.String updateThreadContext2(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r6) {
            r5 = this;
            kotlinx.coroutines.CoroutineName$Key r0 = kotlinx.coroutines.CoroutineName.Key
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r0)
            kotlinx.coroutines.CoroutineName r6 = (kotlinx.coroutines.CoroutineName) r6
            if (r6 != 0) goto Lb
            goto L11
        Lb:
            java.lang.String r6 = r6.getName()
            if (r6 != 0) goto L13
        L11:
            java.lang.String r6 = "coroutine"
        L13:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = r0.getName()
            int r2 = kotlin.text.StringsKt.lastIndexOf$default(r1)
            if (r2 >= 0) goto L25
            int r2 = r1.length()
        L25:
            int r3 = r6.length()
            int r3 = r3 + r2
            int r3 = r3 + 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.append(r2)
            java.lang.String r2 = " @"
            r4.append(r2)
            r4.append(r6)
            r6 = 35
            r4.append(r6)
            long r2 = r5.getId()
            r4.append(r2)
            java.lang.String r6 = r4.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.setName(r6)
            return r1
    }
}
