package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "T", "spreadArgument", "", "addSpread", "(Ljava/lang/Object;)V", "", "size", "I", "position", "getPosition", "()I", "setPosition", "(I)V", "", "spreads", "[Ljava/lang/Object;", "getSpreads$annotations", "()V", "<init>", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;

    @org.jetbrains.annotations.NotNull
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int r1) {
            r0 = this;
            r0.<init>()
            r0.size = r1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.spreads = r1
            return
    }

    private static /* synthetic */ void getSpreads$annotations() {
            return
    }

    public final void addSpread(@org.jetbrains.annotations.NotNull T r4) {
            r3 = this;
            java.lang.String r0 = "spreadArgument"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            T[] r0 = r3.spreads
            int r1 = r3.position
            int r2 = r1 + 1
            r3.position = r2
            r0[r1] = r4
            return
    }

    public final int getPosition() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    public abstract int getSize(@org.jetbrains.annotations.NotNull T r1);

    public final void setPosition(int r1) {
            r0 = this;
            r0.position = r1
            return
    }

    public final int size() {
            r5 = this;
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r5.size
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r0.<init>(r3, r1)
            kotlin.collections.IntIterator r0 = r0.iterator2()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            int r1 = r0.nextInt()
            T[] r4 = r5.spreads
            r1 = r4[r1]
            if (r1 == 0) goto L23
            int r1 = r5.getSize(r1)
            goto L24
        L23:
            r1 = 1
        L24:
            int r3 = r3 + r1
            goto Le
        L26:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final T toArray(@org.jetbrains.annotations.NotNull T r8, @org.jetbrains.annotations.NotNull T r9) {
            r7 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.size
            int r1 = r1 + (-1)
            r2 = 0
            r0.<init>(r2, r1)
            kotlin.collections.IntIterator r0 = r0.iterator2()
            r1 = 0
            r3 = 0
        L1c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3f
            int r4 = r0.nextInt()
            T[] r5 = r7.spreads
            r5 = r5[r4]
            if (r5 == 0) goto L1c
            if (r1 >= r4) goto L34
            int r6 = r4 - r1
            java.lang.System.arraycopy(r8, r1, r9, r3, r6)
            int r3 = r3 + r6
        L34:
            int r1 = r7.getSize(r5)
            java.lang.System.arraycopy(r5, r2, r9, r3, r1)
            int r3 = r3 + r1
            int r1 = r4 + 1
            goto L1c
        L3f:
            int r0 = r7.size
            if (r1 >= r0) goto L47
            int r0 = r0 - r1
            java.lang.System.arraycopy(r8, r1, r9, r3, r0)
        L47:
            return r9
    }
}
