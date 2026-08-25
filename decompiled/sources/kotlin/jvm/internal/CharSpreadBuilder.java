package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlin/jvm/internal/CharSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", "value", "", "add", "toArray", "values", "[C", "", "size", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class CharSpreadBuilder extends kotlin.jvm.internal.PrimitiveSpreadBuilder<char[]> {

    @org.jetbrains.annotations.NotNull
    private final char[] values;

    public CharSpreadBuilder(int r1) {
            r0 = this;
            r0.<init>(r1)
            char[] r1 = new char[r1]
            r0.values = r1
            return
    }

    public final void add(char r4) {
            r3 = this;
            char[] r0 = r3.values
            int r1 = r3.getPosition()
            int r2 = r1 + 1
            r3.setPosition(r2)
            r0[r1] = r4
            return
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(char[] r2) {
            r1 = this;
            char[] r2 = (char[]) r2
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r2 = r2.length
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final char[] toArray() {
            r2 = this;
            char[] r0 = r2.values
            int r1 = r2.size()
            char[] r1 = new char[r1]
            r2.toArray(r0, r1)
            char[] r1 = (char[]) r1
            return r1
    }
}
