package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements androidx.constraintlayout.core.widgets.analyzer.Dependency {
    public androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimension;
    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehavior;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode end;
    public androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType mRunType;
    public int matchConstraintsType;
    public int orientation;
    public boolean resolved;
    public androidx.constraintlayout.core.widgets.analyzer.RunGroup runGroup;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode start;
    public androidx.constraintlayout.core.widgets.ConstraintWidget widget;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    public static final enum RunType extends java.lang.Enum<androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType> {
        private static final /* synthetic */ androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType[] $VALUES = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType CENTER = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType END = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType NONE = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType START = null;

        static {
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.NONE = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType
                java.lang.String r3 = "START"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START = r1
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r3 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType
                java.lang.String r5 = "END"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END = r3
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r5 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType
                java.lang.String r7 = "CENTER"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER = r5
                r7 = 4
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r7 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.$VALUES = r7
                return
        }

        private RunType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType> r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType) r1
                return r1
        }

        public static androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType[] values() {
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType[]) r0
                return r0
        }
    }

    public WidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            r1.<init>()
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = new androidx.constraintlayout.core.widgets.analyzer.DimensionDependency
            r0.<init>(r1)
            r1.dimension = r0
            r0 = 0
            r1.orientation = r0
            r1.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            r0.<init>(r1)
            r1.start = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            r0.<init>(r1)
            r1.end = r0
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.NONE
            r1.mRunType = r0
            r1.widget = r2
            return
    }

    private void resolveDimension(int r8, int r9) {
            r7 = this;
            int r0 = r7.matchConstraintsType
            if (r0 == 0) goto L94
            r1 = 1
            if (r0 == r1) goto L82
            r9 = 2
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == r9) goto L53
            r9 = 3
            if (r0 == r9) goto L11
            goto L9d
        L11:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r3.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L2b
            int r4 = r3.matchConstraintsType
            if (r4 != r9) goto L2b
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r0.verticalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r4.dimensionBehavior
            if (r6 != r5) goto L2b
            int r4 = r4.matchConstraintsType
            if (r4 != r9) goto L2b
            goto L9d
        L2b:
            if (r8 != 0) goto L2f
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r0.verticalRun
        L2f:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r3.dimension
            boolean r9 = r9.resolved
            if (r9 == 0) goto L9d
            float r9 = r0.getDimensionRatio()
            if (r8 != r1) goto L44
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r8 = r3.dimension
            int r8 = r8.value
            float r8 = (float) r8
            float r8 = r8 / r9
            float r8 = r8 + r2
            int r8 = (int) r8
            goto L4d
        L44:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r8 = r3.dimension
            int r8 = r8.value
            float r8 = (float) r8
            float r9 = r9 * r8
            float r9 = r9 + r2
            int r8 = (int) r9
        L4d:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r7.dimension
            r9.resolve(r8)
            goto L9d
        L53:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.getParent()
            if (r9 == 0) goto L9d
            if (r8 != 0) goto L60
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r9 = r9.horizontalRun
            goto L62
        L60:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r9 = r9.verticalRun
        L62:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r9.dimension
            boolean r0 = r9.resolved
            if (r0 == 0) goto L9d
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            if (r8 != 0) goto L6f
            float r0 = r0.mMatchConstraintPercentWidth
            goto L71
        L6f:
            float r0 = r0.mMatchConstraintPercentHeight
        L71:
            int r9 = r9.value
            float r9 = (float) r9
            float r9 = r9 * r0
            float r9 = r9 + r2
            int r9 = (int) r9
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            int r8 = r7.getLimitedDimension(r9, r8)
            r0.resolve(r8)
            goto L9d
        L82:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            int r0 = r0.wrapValue
            int r8 = r7.getLimitedDimension(r0, r8)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            int r8 = java.lang.Math.min(r8, r9)
            r0.resolve(r8)
            goto L9d
        L94:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            int r8 = r7.getLimitedDimension(r9, r8)
            r0.resolve(r8)
        L9d:
            return
    }

    public final void addTarget(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2, androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3, int r4) {
            r1 = this;
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r2.targets
            r0.add(r3)
            r2.margin = r4
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r3 = r3.dependencies
            r3.add(r2)
            return
    }

    public final void addTarget(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3, androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4, int r5, androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6) {
            r2 = this;
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r3.targets
            r0.add(r4)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r3.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r2.dimension
            r0.add(r1)
            r3.marginFactor = r5
            r3.marginDependency = r6
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r4 = r4.dependencies
            r4.add(r3)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r4 = r6.dependencies
            r4.add(r3)
            return
    }

    public abstract void apply();

    public abstract void applyToWidget();

    public abstract void clear();

    public final int getLimitedDimension(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L15
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.widget
            int r0 = r3.mMatchConstraintMaxWidth
            int r3 = r3.mMatchConstraintMinWidth
            int r3 = java.lang.Math.max(r3, r2)
            if (r0 <= 0) goto L12
            int r3 = java.lang.Math.min(r0, r2)
        L12:
            if (r3 == r2) goto L28
            goto L27
        L15:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.widget
            int r0 = r3.mMatchConstraintMaxHeight
            int r3 = r3.mMatchConstraintMinHeight
            int r3 = java.lang.Math.max(r3, r2)
            if (r0 <= 0) goto L25
            int r3 = java.lang.Math.min(r0, r2)
        L25:
            if (r3 == r2) goto L28
        L27:
            r2 = r3
        L28:
            return r2
    }

    public final androidx.constraintlayout.core.widgets.analyzer.DependencyNode getTarget(androidx.constraintlayout.core.widgets.ConstraintAnchor r4) {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            r0 = 0
            if (r4 != 0) goto L6
            return r0
        L6:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r4.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = r4.mType
            int[] r2 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type
            int r4 = r4.ordinal()
            r4 = r2[r4]
            r2 = 1
            if (r4 == r2) goto L36
            r2 = 2
            if (r4 == r2) goto L31
            r2 = 3
            if (r4 == r2) goto L2c
            r2 = 4
            if (r4 == r2) goto L27
            r2 = 5
            if (r4 == r2) goto L22
            goto L3a
        L22:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r4.end
            goto L3a
        L27:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r4.baseline
            goto L3a
        L2c:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r4.start
            goto L3a
        L31:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r4.end
            goto L3a
        L36:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r4.start
        L3a:
            return r0
    }

    public final androidx.constraintlayout.core.widgets.analyzer.DependencyNode getTarget(androidx.constraintlayout.core.widgets.ConstraintAnchor r3, int r4) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            r0 = 0
            if (r3 != 0) goto L6
            return r0
        L6:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r3.mOwner
            if (r4 != 0) goto Ld
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r1.horizontalRun
            goto Lf
        Ld:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r1.verticalRun
        Lf:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r3.mType
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type
            int r3 = r3.ordinal()
            r3 = r1[r3]
            r1 = 1
            if (r3 == r1) goto L29
            r1 = 2
            if (r3 == r1) goto L26
            r1 = 3
            if (r3 == r1) goto L29
            r1 = 5
            if (r3 == r1) goto L26
            goto L2b
        L26:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r4.end
            goto L2b
        L29:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r4.start
        L2b:
            return r0
    }

    public long getWrapDimension() {
            r2 = this;
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r2.dimension
            boolean r1 = r0.resolved
            if (r1 == 0) goto La
            int r0 = r0.value
            long r0 = (long) r0
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean isCenterConnection() {
            r5 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            if (r2 >= r0) goto L20
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r5.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r4 = r4.targets
            java.lang.Object r4 = r4.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r4
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = r4.run
            if (r4 == r5) goto L1d
            int r3 = r3 + 1
        L1d:
            int r2 = r2 + 1
            goto Lb
        L20:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            r2 = 0
        L29:
            if (r2 >= r0) goto L3e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r5.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r4 = r4.targets
            java.lang.Object r4 = r4.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r4
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = r4.run
            if (r4 == r5) goto L3b
            int r3 = r3 + 1
        L3b:
            int r2 = r2 + 1
            goto L29
        L3e:
            r0 = 2
            if (r3 < r0) goto L42
            r1 = 1
        L42:
            return r1
    }

    public boolean isDimensionResolved() {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r1.dimension
            boolean r0 = r0.resolved
            return r0
    }

    public boolean isResolved() {
            r1 = this;
            boolean r0 = r1.resolved
            return r0
    }

    public abstract boolean supportsWrapComputation();

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r1) {
            r0 = this;
            return
    }

    public final void updateRunCenter(androidx.constraintlayout.core.widgets.ConstraintAnchor r6, androidx.constraintlayout.core.widgets.ConstraintAnchor r7, int r8) {
            r5 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.getTarget(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.getTarget(r7)
            boolean r2 = r0.resolved
            if (r2 == 0) goto L7d
            boolean r2 = r1.resolved
            if (r2 != 0) goto L11
            goto L7d
        L11:
            int r2 = r0.value
            int r6 = r6.getMargin()
            int r6 = r6 + r2
            int r2 = r1.value
            int r7 = r7.getMargin()
            int r2 = r2 - r7
            int r7 = r2 - r6
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            boolean r3 = r3.resolved
            if (r3 != 0) goto L30
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r5.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r4) goto L30
            r5.resolveDimension(r8, r7)
        L30:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            boolean r4 = r3.resolved
            if (r4 != 0) goto L37
            return
        L37:
            int r3 = r3.value
            if (r3 != r7) goto L46
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r5.start
            r7.resolve(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.end
            r6.resolve(r2)
            return
        L46:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r5.widget
            if (r8 != 0) goto L4f
            float r7 = r7.getHorizontalBiasPercent()
            goto L53
        L4f:
            float r7 = r7.getVerticalBiasPercent()
        L53:
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r0 != r1) goto L5d
            int r6 = r0.value
            int r2 = r1.value
            r7 = 1056964608(0x3f000000, float:0.5)
        L5d:
            int r2 = r2 - r6
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            int r0 = r0.value
            int r2 = r2 - r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            float r6 = (float) r6
            float r6 = r6 + r8
            float r8 = (float) r2
            float r8 = r8 * r7
            float r8 = r8 + r6
            int r6 = (int) r8
            r0.resolve(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r5.start
            int r7 = r7.value
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r8 = r5.dimension
            int r8 = r8.value
            int r7 = r7 + r8
            r6.resolve(r7)
        L7d:
            return
    }

    public long wrapSize(int r5) {
            r4 = this;
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r4.dimension
            boolean r1 = r0.resolved
            if (r1 == 0) goto L29
            int r0 = r0.value
            long r0 = (long) r0
            boolean r2 = r4.isCenterConnection()
            if (r2 == 0) goto L1b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.start
            int r5 = r5.margin
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r4.end
            int r2 = r2.margin
            int r5 = r5 - r2
        L18:
            long r2 = (long) r5
            long r0 = r0 + r2
            goto L28
        L1b:
            if (r5 != 0) goto L22
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.start
            int r5 = r5.margin
            goto L18
        L22:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.end
            int r5 = r5.margin
            long r2 = (long) r5
            long r0 = r0 - r2
        L28:
            return r0
        L29:
            r0 = 0
            return r0
    }
}
