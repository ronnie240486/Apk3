package kotlin.text;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StringsKt___StringsKt$asIterable$$inlined$Iterable$1 implements java.lang.Iterable<java.lang.Character>, kotlin.jvm.internal.markers.KMappedMarker {
    public final /* synthetic */ java.lang.CharSequence $this_asIterable$inlined;

    public StringsKt___StringsKt$asIterable$$inlined$Iterable$1(java.lang.CharSequence r1) {
            r0 = this;
            r0.$this_asIterable$inlined = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<java.lang.Character> iterator() {
            r1 = this;
            java.lang.CharSequence r0 = r1.$this_asIterable$inlined
            kotlin.collections.CharIterator r0 = kotlin.text.StringsKt__StringsKt.iterator(r0)
            return r0
    }
}
