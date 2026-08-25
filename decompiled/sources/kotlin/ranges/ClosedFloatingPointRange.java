package kotlin.ranges;

import java.lang.Comparable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.1")
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/ranges/ClosedFloatingPointRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "lessThanOrEquals", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ClosedFloatingPointRange<T extends java.lang.Comparable<? super T>> extends kotlin.ranges.ClosedRange<T> {

    /* JADX INFO: compiled from: Ranges.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends java.lang.Comparable<? super T>> boolean contains(@org.jetbrains.annotations.NotNull kotlin.ranges.ClosedFloatingPointRange<T> r1, @org.jetbrains.annotations.NotNull T r2) {
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.Comparable r0 = r1.getStart()
                boolean r0 = r1.lessThanOrEquals(r0, r2)
                if (r0 == 0) goto L1c
                java.lang.Comparable r0 = r1.getEndInclusive()
                boolean r1 = r1.lessThanOrEquals(r2, r0)
                if (r1 == 0) goto L1c
                r1 = 1
                goto L1d
            L1c:
                r1 = 0
            L1d:
                return r1
        }

        public static <T extends java.lang.Comparable<? super T>> boolean isEmpty(@org.jetbrains.annotations.NotNull kotlin.ranges.ClosedFloatingPointRange<T> r2) {
                java.lang.Comparable r0 = r2.getStart()
                java.lang.Comparable r1 = r2.getEndInclusive()
                boolean r2 = r2.lessThanOrEquals(r0, r1)
                r2 = r2 ^ 1
                return r2
        }
    }

    @Override // kotlin.ranges.ClosedRange
    boolean contains(@org.jetbrains.annotations.NotNull T r1);

    @Override // kotlin.ranges.ClosedRange
    boolean isEmpty();

    boolean lessThanOrEquals(@org.jetbrains.annotations.NotNull T r1, @org.jetbrains.annotations.NotNull T r2);
}
