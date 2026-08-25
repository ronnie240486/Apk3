package kotlin.contracts;

/* JADX INFO: compiled from: ContractBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.internal.ContractsDsl
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH'J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\f\u001a\u00020\rH'¨\u0006\u000e"}, d2 = {"Lkotlin/contracts/ContractBuilder;", "", "callsInPlace", "Lkotlin/contracts/CallsInPlace;", "R", "lambda", "Lkotlin/Function;", "kind", "Lkotlin/contracts/InvocationKind;", "returns", "Lkotlin/contracts/Returns;", "value", "returnsNotNull", "Lkotlin/contracts/ReturnsNotNull;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.contracts.ExperimentalContracts
public interface ContractBuilder {

    /* JADX INFO: compiled from: ContractBuilder.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ kotlin.contracts.CallsInPlace callsInPlace$default(kotlin.contracts.ContractBuilder r0, kotlin.Function r1, kotlin.contracts.InvocationKind r2, int r3, java.lang.Object r4) {
                if (r4 != 0) goto Ld
                r3 = r3 & 2
                if (r3 == 0) goto L8
                kotlin.contracts.InvocationKind r2 = kotlin.contracts.InvocationKind.UNKNOWN
            L8:
                kotlin.contracts.CallsInPlace r0 = r0.callsInPlace(r1, r2)
                return r0
            Ld:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: callsInPlace"
                r0.<init>(r1)
                throw r0
        }
    }

    @kotlin.internal.ContractsDsl
    @org.jetbrains.annotations.NotNull
    <R> kotlin.contracts.CallsInPlace callsInPlace(@org.jetbrains.annotations.NotNull kotlin.Function<? extends R> r1, @org.jetbrains.annotations.NotNull kotlin.contracts.InvocationKind r2);

    @kotlin.internal.ContractsDsl
    @org.jetbrains.annotations.NotNull
    kotlin.contracts.Returns returns();

    @kotlin.internal.ContractsDsl
    @org.jetbrains.annotations.NotNull
    kotlin.contracts.Returns returns(@org.jetbrains.annotations.Nullable java.lang.Object r1);

    @kotlin.internal.ContractsDsl
    @org.jetbrains.annotations.NotNull
    kotlin.contracts.ReturnsNotNull returnsNotNull();
}
