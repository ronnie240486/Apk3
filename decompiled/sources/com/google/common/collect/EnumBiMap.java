package com.google.common.collect;

import java.lang.Enum;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtCompatible(emulated = true)
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class EnumBiMap<K extends java.lang.Enum<K>, V extends java.lang.Enum<V>> extends com.google.common.collect.AbstractBiMap<K, V> {

    @com.google.common.annotations.GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient java.lang.Class<K> keyType;
    private transient java.lang.Class<V> valueType;

    private EnumBiMap(java.lang.Class<K> r3, java.lang.Class<V> r4) {
            r2 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            r0.<init>(r3)
            java.util.EnumMap r1 = new java.util.EnumMap
            r1.<init>(r4)
            r2.<init>(r0, r1)
            r2.keyType = r3
            r2.valueType = r4
            return
    }

    public static <K extends java.lang.Enum<K>, V extends java.lang.Enum<V>> com.google.common.collect.EnumBiMap<K, V> create(java.lang.Class<K> r1, java.lang.Class<V> r2) {
            com.google.common.collect.EnumBiMap r0 = new com.google.common.collect.EnumBiMap
            r0.<init>(r1, r2)
            return r0
    }

    public static <K extends java.lang.Enum<K>, V extends java.lang.Enum<V>> com.google.common.collect.EnumBiMap<K, V> create(java.util.Map<K, V> r2) {
            java.lang.Class r0 = inferKeyType(r2)
            java.lang.Class r1 = inferValueType(r2)
            com.google.common.collect.EnumBiMap r0 = create(r0, r1)
            r0.putAll(r2)
            return r0
    }

    public static <K extends java.lang.Enum<K>> java.lang.Class<K> inferKeyType(java.util.Map<K, ?> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.EnumBiMap
            if (r0 == 0) goto Lb
            com.google.common.collect.EnumBiMap r1 = (com.google.common.collect.EnumBiMap) r1
            java.lang.Class r1 = r1.keyType()
            return r1
        Lb:
            boolean r0 = r1 instanceof com.google.common.collect.EnumHashBiMap
            if (r0 == 0) goto L16
            com.google.common.collect.EnumHashBiMap r1 = (com.google.common.collect.EnumHashBiMap) r1
            java.lang.Class r1 = r1.keyType()
            return r1
        L16:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            com.google.common.base.Preconditions.checkArgument(r0)
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.Class r1 = r1.getDeclaringClass()
            return r1
    }

    private static <V extends java.lang.Enum<V>> java.lang.Class<V> inferValueType(java.util.Map<?, V> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.EnumBiMap
            if (r0 == 0) goto L9
            com.google.common.collect.EnumBiMap r1 = (com.google.common.collect.EnumBiMap) r1
            java.lang.Class<V extends java.lang.Enum<V>> r1 = r1.valueType
            return r1
        L9:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            com.google.common.base.Preconditions.checkArgument(r0)
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.Class r1 = r1.getDeclaringClass()
            return r1
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r4) throws java.io.IOException, java.lang.ClassNotFoundException {
            r3 = this;
            r4.defaultReadObject()
            java.lang.Object r0 = r4.readObject()
            java.lang.Class r0 = (java.lang.Class) r0
            r3.keyType = r0
            java.lang.Object r0 = r4.readObject()
            java.lang.Class r0 = (java.lang.Class) r0
            r3.valueType = r0
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<K extends java.lang.Enum<K>> r1 = r3.keyType
            r0.<init>(r1)
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<V extends java.lang.Enum<V>> r2 = r3.valueType
            r1.<init>(r2)
            r3.setDelegates(r0, r1)
            com.google.common.collect.Serialization.populateMap(r3, r4)
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            r2.defaultWriteObject()
            java.lang.Class<K extends java.lang.Enum<K>> r0 = r1.keyType
            r2.writeObject(r0)
            java.lang.Class<V extends java.lang.Enum<V>> r0 = r1.valueType
            r2.writeObject(r0)
            com.google.common.collect.Serialization.writeMap(r1, r2)
            return
    }

    @Override // com.google.common.collect.AbstractBiMap
    public final java.lang.Object checkKey(java.lang.Object r1) {
            r0 = this;
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Enum r1 = (java.lang.Enum) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractBiMap
    public final java.lang.Object checkValue(java.lang.Object r1) {
            r0 = this;
            java.lang.Enum r1 = (java.lang.Enum) r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Enum r1 = (java.lang.Enum) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
            r0 = this;
            super.clear()
            return
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.containsValue(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = super.entrySet()
            return r0
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object forcePut(@com.google.common.collect.ParametricNullness java.lang.Object r1, @com.google.common.collect.ParametricNullness java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.forcePut(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ com.google.common.collect.BiMap inverse() {
            r1 = this;
            com.google.common.collect.BiMap r0 = super.inverse()
            return r0
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
            r1 = this;
            java.util.Set r0 = super.keySet()
            return r0
    }

    public java.lang.Class<K> keyType() {
            r1 = this;
            java.lang.Class<K extends java.lang.Enum<K>> r0 = r1.keyType
            return r0
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object put(@com.google.common.collect.ParametricNullness java.lang.Object r1, @com.google.common.collect.ParametricNullness java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.put(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ void putAll(java.util.Map r1) {
            r0 = this;
            super.putAll(r1)
            return
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            return r1
    }

    public java.lang.Class<V> valueType() {
            r1 = this;
            java.lang.Class<V extends java.lang.Enum<V>> r0 = r1.valueType
            return r0
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ java.util.Set values() {
            r1 = this;
            java.util.Set r0 = super.values()
            return r0
    }
}
