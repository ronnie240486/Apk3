package org.bson.util;

/* JADX INFO: loaded from: classes3.dex */
abstract class CopyOnWriteMap<K, V> extends org.bson.util.AbstractCopyOnWriteMap<K, V, java.util.Map<K, V>> {
    private static final long serialVersionUID = 7935514534647505917L;

    public static class Builder<K, V> {
        private final java.util.Map<K, V> initialValues;
        private org.bson.util.AbstractCopyOnWriteMap.View.Type viewType;

        public Builder() {
                r1 = this;
                r1.<init>()
                org.bson.util.AbstractCopyOnWriteMap$View$Type r0 = org.bson.util.AbstractCopyOnWriteMap.View.Type.STABLE
                r1.viewType = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.initialValues = r0
                return
        }

        public org.bson.util.CopyOnWriteMap.Builder<K, V> addAll(java.util.Map<? extends K, ? extends V> r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.initialValues
                r0.putAll(r2)
                return r1
        }

        public org.bson.util.CopyOnWriteMap.Builder<K, V> liveViews() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap$View$Type r0 = org.bson.util.AbstractCopyOnWriteMap.View.Type.LIVE
                r1.viewType = r0
                return r1
        }

        public org.bson.util.CopyOnWriteMap<K, V> newHashMap() {
                r3 = this;
                org.bson.util.CopyOnWriteMap$Hash r0 = new org.bson.util.CopyOnWriteMap$Hash
                java.util.Map<K, V> r1 = r3.initialValues
                org.bson.util.AbstractCopyOnWriteMap$View$Type r2 = r3.viewType
                r0.<init>(r1, r2)
                return r0
        }

        public org.bson.util.CopyOnWriteMap<K, V> newLinkedMap() {
                r3 = this;
                org.bson.util.CopyOnWriteMap$Linked r0 = new org.bson.util.CopyOnWriteMap$Linked
                java.util.Map<K, V> r1 = r3.initialValues
                org.bson.util.AbstractCopyOnWriteMap$View$Type r2 = r3.viewType
                r0.<init>(r1, r2)
                return r0
        }

        public org.bson.util.CopyOnWriteMap.Builder<K, V> stableViews() {
                r1 = this;
                org.bson.util.AbstractCopyOnWriteMap$View$Type r0 = org.bson.util.AbstractCopyOnWriteMap.View.Type.STABLE
                r1.viewType = r0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Hash<K, V> extends org.bson.util.CopyOnWriteMap<K, V> {
        private static final long serialVersionUID = 5221824943734164497L;

        public Hash(java.util.Map<? extends K, ? extends V> r1, org.bson.util.AbstractCopyOnWriteMap.View.Type r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap
        public <N extends java.util.Map<? extends K, ? extends V>> java.util.Map<K, V> copy(N r2) {
                r1 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>(r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Linked<K, V> extends org.bson.util.CopyOnWriteMap<K, V> {
        private static final long serialVersionUID = -8659999465009072124L;

        public Linked(java.util.Map<? extends K, ? extends V> r1, org.bson.util.AbstractCopyOnWriteMap.View.Type r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap
        public <N extends java.util.Map<? extends K, ? extends V>> java.util.Map<K, V> copy(N r2) {
                r1 = this;
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>(r2)
                return r0
        }
    }

    public CopyOnWriteMap() {
            r2 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            org.bson.util.AbstractCopyOnWriteMap$View$Type r1 = org.bson.util.AbstractCopyOnWriteMap.View.Type.LIVE
            r2.<init>(r0, r1)
            return
    }

    public CopyOnWriteMap(java.util.Map<? extends K, ? extends V> r1, org.bson.util.AbstractCopyOnWriteMap.View.Type r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <K, V> org.bson.util.CopyOnWriteMap.Builder<K, V> builder() {
            org.bson.util.CopyOnWriteMap$Builder r0 = new org.bson.util.CopyOnWriteMap$Builder
            r0.<init>()
            return r0
    }

    public static <K, V> org.bson.util.CopyOnWriteMap<K, V> newHashMap() {
            org.bson.util.CopyOnWriteMap$Builder r0 = builder()
            org.bson.util.CopyOnWriteMap r0 = r0.newHashMap()
            return r0
    }

    public static <K, V> org.bson.util.CopyOnWriteMap<K, V> newHashMap(java.util.Map<? extends K, ? extends V> r1) {
            org.bson.util.CopyOnWriteMap$Builder r0 = builder()
            org.bson.util.CopyOnWriteMap$Builder r1 = r0.addAll(r1)
            org.bson.util.CopyOnWriteMap r1 = r1.newHashMap()
            return r1
    }

    public static <K, V> org.bson.util.CopyOnWriteMap<K, V> newLinkedMap() {
            org.bson.util.CopyOnWriteMap$Builder r0 = builder()
            org.bson.util.CopyOnWriteMap r0 = r0.newLinkedMap()
            return r0
    }

    public static <K, V> org.bson.util.CopyOnWriteMap<K, V> newLinkedMap(java.util.Map<? extends K, ? extends V> r1) {
            org.bson.util.CopyOnWriteMap$Builder r0 = builder()
            org.bson.util.CopyOnWriteMap$Builder r1 = r0.addAll(r1)
            org.bson.util.CopyOnWriteMap r1 = r1.newLinkedMap()
            return r1
    }
}
