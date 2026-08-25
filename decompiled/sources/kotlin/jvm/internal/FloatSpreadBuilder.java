package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlin/jvm/internal/FloatSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", "value", "", "add", "toArray", "values", "[F", "", "size", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class FloatSpreadBuilder extends kotlin.jvm.internal.PrimitiveSpreadBuilder<float[]> {

    @org.jetbrains.annotations.NotNull
    private final float[] values;

    public FloatSpreadBuilder(int r1) {
            r0 = this;
            r0.<init>(r1)
            float[] r1 = new float[r1]
            r0.values = r1
            return
    }

    public final void add(float r4) {
            r3 = this;
            float[] r0 = r3.values
            int r1 = r3.getPosition()
            int r2 = r1 + 1
            r3.setPosition(r2)
            r0[r1] = r4
            return
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(float[] r2) {
            r1 = this;
            float[] r2 = (float[]) r2
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r2 = r2.length
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final float[] toArray() {
            r2 = this;
            float[] r0 = r2.values
            int r1 = r2.size()
            float[] r1 = new float[r1]
            r2.toArray(r0, r1)
            float[] r1 = (float[]) r1
            return r1
    }
}
