package kotlin.properties;

/* JADX INFO: compiled from: ObservableProperty.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0007\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/properties/ObservableProperty;", "V", "Lkotlin/properties/ReadWriteProperty;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Ljava/lang/Object;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public abstract class ObservableProperty<V> implements kotlin.properties.ReadWriteProperty<java.lang.Object, V> {
    private V value;

    public ObservableProperty(V r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public void afterChange(@org.jetbrains.annotations.NotNull kotlin.reflect.KProperty<?> r1, V r2, V r3) {
            r0 = this;
            java.lang.String r2 = "property"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            return
    }

    public boolean beforeChange(@org.jetbrains.annotations.NotNull kotlin.reflect.KProperty<?> r1, V r2, V r3) {
            r0 = this;
            java.lang.String r2 = "property"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r1 = 1
            return r1
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.reflect.KProperty<?> r2) {
            r0 = this;
            java.lang.String r1 = "property"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            V r1 = r0.value
            return r1
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.reflect.KProperty<?> r3, V r4) {
            r1 = this;
            java.lang.String r2 = "property"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            V r2 = r1.value
            boolean r0 = r1.beforeChange(r3, r2, r4)
            if (r0 != 0) goto Le
            return
        Le:
            r1.value = r4
            r1.afterChange(r3, r2, r4)
            return
    }
}
