package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public class GlideExperiments {
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments.Experiment> experiments;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder {
        private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments.Experiment> experiments;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.experiments = r0
                return
        }

        public static /* synthetic */ java.util.Map access$000(com.bumptech.glide.GlideExperiments.Builder r0) {
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments$Experiment> r0 = r0.experiments
                return r0
        }

        public final com.bumptech.glide.GlideExperiments.Builder update(com.bumptech.glide.GlideExperiments.Experiment r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto Lc
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments$Experiment> r3 = r1.experiments
                java.lang.Class r0 = r2.getClass()
                r3.put(r0, r2)
                goto L15
            Lc:
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments$Experiment> r3 = r1.experiments
                java.lang.Class r2 = r2.getClass()
                r3.remove(r2)
            L15:
                return r1
        }
    }

    public interface Experiment {
    }

    public GlideExperiments(com.bumptech.glide.GlideExperiments.Builder r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r2 = com.bumptech.glide.GlideExperiments.Builder.access$000(r2)
            r0.<init>(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            r1.experiments = r2
            return
    }

    public boolean isEnabled(java.lang.Class<? extends com.bumptech.glide.GlideExperiments.Experiment> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments$Experiment> r0 = r1.experiments
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
