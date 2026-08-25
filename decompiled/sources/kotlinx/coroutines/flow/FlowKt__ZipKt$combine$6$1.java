package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 176)
public final class FlowKt__ZipKt$combine$6$1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T[]> {
    public final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flowArray;

    public FlowKt__ZipKt$combine$6$1(kotlinx.coroutines.flow.Flow<T>[] r1) {
            r0 = this;
            r0.$flowArray = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r1 = this;
            java.lang.Object[] r0 = r1.invoke()
            return r0
    }

    @Override // kotlin.jvm.functions.Function0
    @org.jetbrains.annotations.Nullable
    public final T[] invoke() {
            r3 = this;
            kotlinx.coroutines.flow.Flow<T>[] r0 = r3.$flowArray
            int r0 = r0.length
            r1 = 0
            java.lang.String r2 = "T?"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
    }
}
