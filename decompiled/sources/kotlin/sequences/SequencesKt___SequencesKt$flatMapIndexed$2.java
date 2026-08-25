package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2<R> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.sequences.Sequence<? extends R>, java.util.Iterator<? extends R>> {
    public static final kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2 INSTANCE = null;

    static {
            kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2 r0 = new kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2
            r0.<init>()
            kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2.INSTANCE = r0
            return
    }

    public SequencesKt___SequencesKt$flatMapIndexed$2() {
            r6 = this;
            java.lang.Class<kotlin.sequences.Sequence> r2 = kotlin.sequences.Sequence.class
            r1 = 1
            java.lang.String r3 = "iterator"
            java.lang.String r4 = "iterator()Ljava/util/Iterator;"
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            kotlin.sequences.Sequence r1 = (kotlin.sequences.Sequence) r1
            java.util.Iterator r1 = r0.invoke(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<R> invoke(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            return r2
    }
}
