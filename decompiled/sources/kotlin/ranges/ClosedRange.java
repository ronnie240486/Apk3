package kotlin.ranges;

import java.lang.Comparable;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/ClosedRange;", "T", "", "", "endInclusive", "getEndInclusive", "()Ljava/lang/Comparable;", "start", "getStart", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ClosedRange<T extends java.lang.Comparable<? super T>> {

    /* JADX INFO: compiled from: Range.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends java.lang.Comparable<? super T>> boolean contains(@org.jetbrains.annotations.NotNull kotlin.ranges.ClosedRange<T> r1, @org.jetbrains.annotations.NotNull T r2) {
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.Comparable r0 = r1.getStart()
                int r0 = r2.compareTo(r0)
                if (r0 < 0) goto L1c
                java.lang.Comparable r1 = r1.getEndInclusive()
                int r1 = r2.compareTo(r1)
                if (r1 > 0) goto L1c
                r1 = 1
                goto L1d
            L1c:
                r1 = 0
            L1d:
                return r1
        }

        public static <T extends java.lang.Comparable<? super T>> boolean isEmpty(@org.jetbrains.annotations.NotNull kotlin.ranges.ClosedRange<T> r1) {
                java.lang.Comparable r0 = r1.getStart()
                java.lang.Comparable r1 = r1.getEndInclusive()
                int r1 = r0.compareTo(r1)
                if (r1 <= 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                return r1
        }
    }

    boolean contains(@org.jetbrains.annotations.NotNull T r1);

    @org.jetbrains.annotations.NotNull
    T getEndInclusive();

    @org.jetbrains.annotations.NotNull
    T getStart();

    boolean isEmpty();
}
