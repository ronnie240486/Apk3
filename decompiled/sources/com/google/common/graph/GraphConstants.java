package com.google.common.graph;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.graph.ElementTypesAreNonnullByDefault
final class GraphConstants {

    /* JADX INFO: loaded from: classes3.dex */
    public static final enum Presence extends java.lang.Enum<com.google.common.graph.GraphConstants.Presence> {
        private static final /* synthetic */ com.google.common.graph.GraphConstants.Presence[] $VALUES = null;
        public static final com.google.common.graph.GraphConstants.Presence EDGE_EXISTS = null;

        private static /* synthetic */ com.google.common.graph.GraphConstants.Presence[] $values() {
                r0 = 1
                com.google.common.graph.GraphConstants$Presence[] r0 = new com.google.common.graph.GraphConstants.Presence[r0]
                com.google.common.graph.GraphConstants$Presence r1 = com.google.common.graph.GraphConstants.Presence.EDGE_EXISTS
                r2 = 0
                r0[r2] = r1
                return r0
        }

        static {
                com.google.common.graph.GraphConstants$Presence r0 = new com.google.common.graph.GraphConstants$Presence
                java.lang.String r1 = "EDGE_EXISTS"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.graph.GraphConstants.Presence.EDGE_EXISTS = r0
                com.google.common.graph.GraphConstants$Presence[] r0 = $values()
                com.google.common.graph.GraphConstants.Presence.$VALUES = r0
                return
        }

        private Presence(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.graph.GraphConstants.Presence valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.graph.GraphConstants$Presence> r0 = com.google.common.graph.GraphConstants.Presence.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.graph.GraphConstants$Presence r1 = (com.google.common.graph.GraphConstants.Presence) r1
                return r1
        }

        public static com.google.common.graph.GraphConstants.Presence[] values() {
                com.google.common.graph.GraphConstants$Presence[] r0 = com.google.common.graph.GraphConstants.Presence.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.graph.GraphConstants$Presence[] r0 = (com.google.common.graph.GraphConstants.Presence[]) r0
                return r0
        }
    }

    private GraphConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}
