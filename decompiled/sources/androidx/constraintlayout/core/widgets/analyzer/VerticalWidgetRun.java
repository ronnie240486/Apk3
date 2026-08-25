package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes3.dex */
public class VerticalWidgetRun extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode baseline;
    public androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency baselineDimension;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType = null;

        static {
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public VerticalWidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget r3) {
            r2 = this;
            r2.<init>(r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            r3.<init>(r2)
            r2.baseline = r3
            r0 = 0
            r2.baselineDimension = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r1 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.TOP
            r0.type = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r1 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BOTTOM
            r0.type = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BASELINE
            r3.type = r0
            r3 = 1
            r2.orientation = r3
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void apply() {
            r9 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r1 = r0.measured
            if (r1 == 0) goto Lf
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            int r0 = r0.getHeight()
            r1.resolve(r0)
        Lf:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L97
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.getVerticalDimensionBehaviour()
            r9.dimensionBehavior = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L2c
            androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency r0 = new androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency
            r0.<init>(r9)
            r9.baselineDimension = r0
        L2c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r1) goto Ld1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L85
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L85
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 != r2) goto L85
            int r1 = r0.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTop
            int r4 = r4.getMargin()
            r9.addTarget(r2, r3, r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mBottom
            int r3 = r3.getMargin()
            int r3 = -r3
            r9.addTarget(r2, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.resolve(r1)
            return
        L85:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r1) goto Ld1
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            int r1 = r1.getHeight()
            r0.resolve(r1)
            goto Ld1
        L97:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto Ld1
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto Ld1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 != r2) goto Ld1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTop
            int r3 = r3.getMargin()
            r9.addTarget(r1, r2, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            int r2 = r2.getMargin()
            int r2 = -r2
            r9.addTarget(r1, r0, r2)
            return
        Ld1:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            boolean r1 = r0.resolved
            r2 = 0
            r3 = 4
            r4 = 1
            r5 = 2
            r6 = 3
            if (r1 == 0) goto L265
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r9.widget
            boolean r8 = r7.measured
            if (r8 == 0) goto L265
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r7.mListAnchors
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L16a
            r1 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L16a
            boolean r0 = r7.isInVerticalChain()
            if (r0 == 0) goto L114
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r5]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r6]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L153
        L114:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L12f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r5]
            int r2 = r2.getMargin()
            r9.addTarget(r1, r0, r2)
        L12f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L14b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r6]
            int r2 = r2.getMargin()
            int r2 = -r2
            r9.addTarget(r1, r0, r2)
        L14b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            r0.delegateToWidgetRun = r4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            r0.delegateToWidgetRun = r4
        L153:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L48a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getBaselineDistance()
            r9.addTarget(r0, r1, r2)
            goto L48a
        L16a:
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L1a9
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L48a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r5]
            int r2 = r2.getMargin()
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            int r2 = r2.value
            r9.addTarget(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L48a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getBaselineDistance()
            r9.addTarget(r0, r1, r2)
            goto L48a
        L1a9:
            r1 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L1ea
            r0 = r0[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L1d3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r6]
            int r2 = r2.getMargin()
            int r2 = -r2
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            int r2 = r2.value
            int r2 = -r2
            r9.addTarget(r0, r1, r2)
        L1d3:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L48a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getBaselineDistance()
            r9.addTarget(r0, r1, r2)
            goto L48a
        L1ea:
            r1 = r0[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L218
            r0 = r0[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L48a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.baseline
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.baseline
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getBaselineDistance()
            int r2 = -r2
            r9.addTarget(r0, r1, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            int r2 = r2.value
            r9.addTarget(r0, r1, r2)
            goto L48a
        L218:
            boolean r0 = r7 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r0 != 0) goto L48a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.getParent()
            if (r0 == 0) goto L48a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 != 0) goto L48a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getY()
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            int r2 = r2.value
            r9.addTarget(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L48a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getBaselineDistance()
            r9.addTarget(r0, r1, r2)
            goto L48a
        L265:
            if (r1 != 0) goto L2d8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r7) goto L2d8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            int r1 = r0.mMatchConstraintDefaultHeight
            if (r1 == r5) goto L2aa
            if (r1 == r6) goto L276
            goto L2db
        L276:
            boolean r0 = r0.isInVerticalChain()
            if (r0 != 0) goto L2db
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            int r1 = r0.mMatchConstraintDefaultWidth
            if (r1 != r6) goto L283
            goto L2db
        L283:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            r1.add(r0)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.delegateToWidgetRun = r4
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            r0.add(r1)
            goto L2db
        L2aa:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 != 0) goto L2b1
            goto L2db
        L2b1:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            r1.add(r0)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.delegateToWidgetRun = r4
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            r0.add(r1)
            goto L2db
        L2d8:
            r0.addDependency(r9)
        L2db:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r0.mListAnchors
            r7 = r1[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L344
            r7 = r1[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L344
            boolean r0 = r0.isInVerticalChain()
            if (r0 == 0) goto L30f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r5]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r6]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L331
        L30f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.getTarget(r1)
            if (r0 == 0) goto L328
            r0.addDependency(r9)
        L328:
            if (r1 == 0) goto L32d
            r1.addDependency(r9)
        L32d:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER
            r9.mRunType = r0
        L331:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L47c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency r2 = r9.baselineDimension
            r9.addTarget(r0, r1, r4, r2)
            goto L47c
        L344:
            r7 = r1[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            r8 = 0
            if (r7 == 0) goto L3b0
            r0 = r1[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L47c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r5]
            int r2 = r2.getMargin()
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            r9.addTarget(r0, r1, r4, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L37c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency r2 = r9.baselineDimension
            r9.addTarget(r0, r1, r4, r2)
        L37c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L47c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L47c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.dimensionBehavior
            if (r2 != r1) goto L47c
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.updateDelegate = r9
            goto L47c
        L3b0:
            r5 = r1[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            r7 = -1
            if (r5 == 0) goto L3eb
            r0 = r1[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L47c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r6]
            int r2 = r2.getMargin()
            int r2 = -r2
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            r9.addTarget(r0, r1, r7, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L47c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency r2 = r9.baselineDimension
            r9.addTarget(r0, r1, r4, r2)
            goto L47c
        L3eb:
            r5 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L411
            r0 = r1[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L47c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.baseline
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency r2 = r9.baselineDimension
            r9.addTarget(r0, r1, r7, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            r9.addTarget(r0, r1, r4, r2)
            goto L47c
        L411:
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r1 != 0) goto L47c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L47c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getY()
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            r9.addTarget(r0, r1, r4, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L44a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency r2 = r9.baselineDimension
            r9.addTarget(r0, r1, r4, r2)
        L44a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L47c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L47c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.dimensionBehavior
            if (r2 != r1) goto L47c
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.updateDelegate = r9
        L47c:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 != 0) goto L48a
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.readyToSolve = r4
        L48a:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.start
            boolean r1 = r0.resolved
            if (r1 == 0) goto Ld
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.widget
            int r0 = r0.value
            r1.setY(r0)
        Ld:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void clear() {
            r1 = this;
            r0 = 0
            r1.runGroup = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.start
            r0.clear()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.end
            r0.clear()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.baseline
            r0.clear()
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r1.dimension
            r0.clear()
            r0 = 0
            r1.resolved = r0
            return
    }

    public final void reset() {
            r2 = this;
            r0 = 0
            r2.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            r1.clear()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            r1.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.end
            r1.clear()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.end
            r1.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.baseline
            r1.clear()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.baseline
            r1.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r2.dimension
            r1.resolved = r0
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean supportsWrapComputation() {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r3.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r2 = 1
            if (r0 != r1) goto L10
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.widget
            int r0 = r0.mMatchConstraintDefaultHeight
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
            return r0
        L10:
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "VerticalRun "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.widget
            java.lang.String r1 = r1.getDebugName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r7) {
            r6 = this;
            int[] r7 = androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = r6.mRunType
            int r0 = r0.ordinal()
            r7 = r7[r0]
            r0 = 3
            r1 = 1
            if (r7 == r0) goto L1bb
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r2 = r7.readyToSolve
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L94
            boolean r7 = r7.resolved
            if (r7 != 0) goto L94
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r2) goto L94
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            int r2 = r7.mMatchConstraintDefaultHeight
            r5 = 2
            if (r2 == r5) goto L76
            if (r2 == r0) goto L2b
            goto L94
        L2b:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto L94
            int r7 = r7.getDimensionRatioSide()
            r0 = -1
            if (r7 == r0) goto L60
            if (r7 == 0) goto L4e
            if (r7 == r1) goto L40
            r7 = 0
            goto L70
        L40:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            float r7 = r7.getDimensionRatio()
            goto L6d
        L4e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            float r7 = r7.getDimensionRatio()
            float r7 = r7 * r0
            float r7 = r7 + r4
            int r7 = (int) r7
            goto L70
        L60:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            float r7 = r7.getDimensionRatio()
        L6d:
            float r0 = r0 / r7
            float r0 = r0 + r4
            int r7 = (int) r0
        L70:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            r0.resolve(r7)
            goto L94
        L76:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r7.getParent()
            if (r7 == 0) goto L94
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r7 = r7.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r7.dimension
            boolean r0 = r7.resolved
            if (r0 == 0) goto L94
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            float r0 = r0.mMatchConstraintPercentHeight
            int r7 = r7.value
            float r7 = (float) r7
            float r7 = r7 * r0
            float r7 = r7 + r4
            int r7 = (int) r7
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            r0.resolve(r7)
        L94:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            boolean r0 = r7.readyToSolve
            if (r0 == 0) goto L1ba
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            boolean r2 = r0.readyToSolve
            if (r2 != 0) goto La2
            goto L1ba
        La2:
            boolean r7 = r7.resolved
            if (r7 == 0) goto Lb1
            boolean r7 = r0.resolved
            if (r7 == 0) goto Lb1
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto Lb1
            return
        Lb1:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto Lfb
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r0) goto Lfb
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            int r0 = r7.mMatchConstraintDefaultWidth
            if (r0 != 0) goto Lfb
            boolean r7 = r7.isInVerticalChain()
            if (r7 != 0) goto Lfb
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            java.lang.Object r7 = r7.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r7 = r7.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            int r2 = r1.margin
            int r7 = r7 + r2
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r6.end
            int r2 = r2.margin
            int r0 = r0 + r2
            int r2 = r0 - r7
            r1.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            r7.resolve(r0)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            r7.resolve(r2)
            return
        Lfb:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto L14f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r0) goto L14f
            int r7 = r6.matchConstraintsType
            if (r7 != r1) goto L14f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L14f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L14f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            java.lang.Object r7 = r7.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r7 = r7.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            int r1 = r1.margin
            int r7 = r7 + r1
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            int r1 = r1.margin
            int r0 = r0 + r1
            int r0 = r0 - r7
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            int r1 = r7.wrapValue
            if (r0 >= r1) goto L14c
            r7.resolve(r0)
            goto L14f
        L14c:
            r7.resolve(r1)
        L14f:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto L156
            return
        L156:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L1ba
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L1ba
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            java.lang.Object r7 = r7.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r1 = r7.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r6.start
            int r2 = r2.margin
            int r1 = r1 + r2
            int r2 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r6.end
            int r3 = r3.margin
            int r2 = r2 + r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r6.widget
            float r3 = r3.getVerticalBiasPercent()
            if (r7 != r0) goto L19a
            int r1 = r7.value
            int r2 = r0.value
            r3 = 1056964608(0x3f000000, float:0.5)
        L19a:
            int r2 = r2 - r1
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            int r7 = r7.value
            int r2 = r2 - r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            float r0 = (float) r1
            float r0 = r0 + r4
            float r1 = (float) r2
            float r1 = r1 * r3
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.resolve(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            int r1 = r1.value
            int r0 = r0 + r1
            r7.resolve(r0)
        L1ba:
            return
        L1bb:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mBottom
            r6.updateRunCenter(r0, r7, r1)
            return
    }
}
