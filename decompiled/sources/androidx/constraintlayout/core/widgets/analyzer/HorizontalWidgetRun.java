package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes2.dex */
public class HorizontalWidgetRun extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    private static int[] tempDimensions;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType = null;

        static {
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            r0 = 2
            int[] r0 = new int[r0]
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions = r0
            return
    }

    public HorizontalWidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.LEFT
            r2.type = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.RIGHT
            r2.type = r0
            r2 = 0
            r1.orientation = r2
            return
    }

    private void computeInsetRatio(int[] r3, int r4, int r5, int r6, int r7, float r8, int r9) {
            r2 = this;
            int r5 = r5 - r4
            int r7 = r7 - r6
            r4 = -1
            r6 = 0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r9 == r4) goto L22
            if (r9 == 0) goto L18
            if (r9 == r1) goto Le
            goto L38
        Le:
            float r4 = (float) r5
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r5
            r3[r1] = r4
            goto L38
        L18:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r4
            r3[r1] = r7
            goto L38
        L22:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            float r9 = (float) r5
            float r9 = r9 / r8
            float r9 = r9 + r0
            int r8 = (int) r9
            if (r4 > r5) goto L32
            r3[r6] = r4
            r3[r1] = r7
            goto L38
        L32:
            if (r8 > r7) goto L38
            r3[r6] = r5
            r3[r1] = r8
        L38:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void apply() {
            r6 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            boolean r1 = r0.measured
            if (r1 == 0) goto Lf
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            int r0 = r0.getWidth()
            r1.resolve(r0)
        Lf:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L8c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.getHorizontalDimensionBehaviour()
            r6.dimensionBehavior = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r1) goto Lcc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L7a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L7a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 == r3) goto L3b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.getHorizontalDimensionBehaviour()
            if (r2 != r1) goto L7a
        L3b:
            int r1 = r0.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mLeft
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mRight
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r6.start
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mLeft
            int r4 = r4.getMargin()
            r6.addTarget(r2, r3, r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r6.end
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mRight
            int r3 = r3.getMargin()
            int r3 = -r3
            r6.addTarget(r2, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            r0.resolve(r1)
            return
        L7a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r6.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r1) goto Lcc
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            int r1 = r1.getWidth()
            r0.resolve(r1)
            goto Lcc
        L8c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r6.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto Lcc
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto Lcc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 == r3) goto La8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.getHorizontalDimensionBehaviour()
            if (r2 != r1) goto Lcc
        La8:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mLeft
            int r3 = r3.getMargin()
            r6.addTarget(r1, r2, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mRight
            int r2 = r2.getMargin()
            int r2 = -r2
            r6.addTarget(r1, r0, r2)
            return
        Lcc:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            boolean r1 = r0.resolved
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1dc
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            boolean r4 = r1.measured
            if (r4 == 0) goto L1dc
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r1.mListAnchors
            r4 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L14e
            r4 = r0[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L14e
            boolean r0 = r1.isInHorizontalChain()
            if (r0 == 0) goto L10d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r2]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r3]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L3e2
        L10d:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.getTarget(r0)
            if (r0 == 0) goto L128
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r4.mListAnchors
            r2 = r4[r2]
            int r2 = r2.getMargin()
            r6.addTarget(r1, r0, r2)
        L128:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.getTarget(r0)
            if (r0 == 0) goto L144
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r3]
            int r2 = r2.getMargin()
            int r2 = -r2
            r6.addTarget(r1, r0, r2)
        L144:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            r0.delegateToWidgetRun = r3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            r0.delegateToWidgetRun = r3
            goto L3e2
        L14e:
            r4 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L178
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.getTarget(r0)
            if (r0 == 0) goto L3e2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r2 = r3[r2]
            int r2 = r2.getMargin()
            r6.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r6.dimension
            int r2 = r2.value
            r6.addTarget(r0, r1, r2)
            goto L3e2
        L178:
            r2 = r0[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L1a4
            r0 = r0[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.getTarget(r0)
            if (r0 == 0) goto L3e2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r3]
            int r2 = r2.getMargin()
            int r2 = -r2
            r6.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r6.dimension
            int r2 = r2.value
            int r2 = -r2
            r6.addTarget(r0, r1, r2)
            goto L3e2
        L1a4:
            boolean r0 = r1 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r0 != 0) goto L3e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.getParent()
            if (r0 == 0) goto L3e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 != 0) goto L3e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            int r2 = r2.getX()
            r6.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r6.dimension
            int r2 = r2.value
            r6.addTarget(r0, r1, r2)
            goto L3e2
        L1dc:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r6.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r4) goto L311
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            int r4 = r1.mMatchConstraintDefaultWidth
            r5 = 2
            if (r4 == r5) goto L2e4
            r5 = 3
            if (r4 == r5) goto L1ee
            goto L311
        L1ee:
            int r4 = r1.mMatchConstraintDefaultHeight
            if (r4 != r5) goto L293
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r6.start
            r4.updateDelegate = r6
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r6.end
            r4.updateDelegate = r6
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.start
            r5.updateDelegate = r6
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.end
            r4.updateDelegate = r6
            r0.updateDelegate = r6
            boolean r0 = r1.isInVerticalChain()
            if (r0 == 0) goto L260
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r0.dimension
            r1.updateDelegate = r6
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            r1.add(r0)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            goto L311
        L260:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            boolean r0 = r0.isInHorizontalChain()
            if (r0 == 0) goto L284
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            goto L311
        L284:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            goto L311
        L293:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            r0.add(r1)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r1.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            r0.delegateToWidgetRun = r3
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            goto L311
        L2e4:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.getParent()
            if (r0 != 0) goto L2eb
            goto L311
        L2eb:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            r1.add(r0)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            r0.delegateToWidgetRun = r3
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            r0.add(r1)
        L311:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r0.mListAnchors
            r4 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L36a
            r4 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L36a
            boolean r0 = r0.isInHorizontalChain()
            if (r0 == 0) goto L346
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r2]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r3]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L3e2
        L346:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.getTarget(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.getTarget(r1)
            if (r0 == 0) goto L35f
            r0.addDependency(r6)
        L35f:
            if (r1 == 0) goto L364
            r1.addDependency(r6)
        L364:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER
            r6.mRunType = r0
            goto L3e2
        L36a:
            r4 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L391
            r0 = r1[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.getTarget(r0)
            if (r0 == 0) goto L3e2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r4.mListAnchors
            r2 = r4[r2]
            int r2 = r2.getMargin()
            r6.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r6.dimension
            r6.addTarget(r0, r1, r3, r2)
            goto L3e2
        L391:
            r2 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L3ba
            r0 = r1[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.getTarget(r0)
            if (r0 == 0) goto L3e2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r3]
            int r2 = r2.getMargin()
            int r2 = -r2
            r6.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            r2 = -1
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r6.dimension
            r6.addTarget(r0, r1, r2, r3)
            goto L3e2
        L3ba:
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r1 != 0) goto L3e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L3e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            int r2 = r2.getX()
            r6.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r6.dimension
            r6.addTarget(r0, r1, r3, r2)
        L3e2:
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
            r1.setX(r0)
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
            int r0 = r0.mMatchConstraintDefaultWidth
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
            java.lang.String r0 = "HorizontalRun "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.widget
            java.lang.String r1 = r1.getDebugName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r17) {
            r16 = this;
            r8 = r16
            int[] r0 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = r8.mRunType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L42d
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 1
            if (r0 != 0) goto L30a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L30a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            int r2 = r0.mMatchConstraintDefaultWidth
            r3 = 2
            if (r2 == r3) goto L2ec
            if (r2 == r1) goto L2a
            goto L30a
        L2a:
            int r2 = r0.mMatchConstraintDefaultHeight
            r3 = -1
            if (r2 == 0) goto L75
            if (r2 != r1) goto L32
            goto L75
        L32:
            int r0 = r0.getDimensionRatioSide()
            if (r0 == r3) goto L5d
            if (r0 == 0) goto L4c
            if (r0 == r11) goto L3e
            r0 = 0
            goto L6e
        L3e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r1 = r1.value
            float r1 = (float) r1
            float r0 = r0.getDimensionRatio()
            goto L6a
        L4c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r1 = r1.value
            float r1 = (float) r1
            float r0 = r0.getDimensionRatio()
            float r1 = r1 / r0
            float r1 = r1 + r10
            int r0 = (int) r1
            goto L6e
        L5d:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r1 = r1.value
            float r1 = (float) r1
            float r0 = r0.getDimensionRatio()
        L6a:
            float r0 = r0 * r1
            float r0 = r0 + r10
            int r0 = (int) r0
        L6e:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
            goto L30a
        L75:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r1.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r1.end
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L83
            r1 = 1
            goto L84
        L83:
            r1 = 0
        L84:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L8c
            r2 = 1
            goto L8d
        L8c:
            r2 = 0
        L8d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L95
            r4 = 1
            goto L96
        L95:
            r4 = 0
        L96:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L9e
            r5 = 1
            goto L9f
        L9e:
            r5 = 0
        L9f:
            int r14 = r0.getDimensionRatioSide()
            if (r1 == 0) goto L1e6
            if (r2 == 0) goto L1e6
            if (r4 == 0) goto L1e6
            if (r5 == 0) goto L1e6
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            float r15 = r0.getDimensionRatio()
            boolean r0 = r12.resolved
            if (r0 == 0) goto L114
            boolean r0 = r13.resolved
            if (r0 == 0) goto L114
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.readyToSolve
            if (r1 == 0) goto L113
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r1 = r1.readyToSolve
            if (r1 != 0) goto Lc6
            goto L113
        Lc6:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.margin
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            int r1 = r1.margin
            int r3 = r0 - r1
            int r0 = r12.value
            int r1 = r12.margin
            int r4 = r0 + r1
            int r0 = r13.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r11]
            r0.resolve(r1)
        L113:
            return
        L114:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.resolved
            if (r1 == 0) goto L171
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r2 = r1.resolved
            if (r2 == 0) goto L171
            boolean r2 = r12.readyToSolve
            if (r2 == 0) goto L170
            boolean r2 = r13.readyToSolve
            if (r2 != 0) goto L129
            goto L170
        L129:
            int r2 = r0.value
            int r0 = r0.margin
            int r2 = r2 + r0
            int r0 = r1.value
            int r1 = r1.margin
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r12.margin
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r11]
            r0.resolve(r1)
            goto L171
        L170:
            return
        L171:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.readyToSolve
            if (r1 == 0) goto L1e5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r1 = r1.readyToSolve
            if (r1 == 0) goto L1e5
            boolean r1 = r12.readyToSolve
            if (r1 == 0) goto L1e5
            boolean r1 = r13.readyToSolve
            if (r1 != 0) goto L186
            goto L1e5
        L186:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.margin
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            int r1 = r1.margin
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r12.margin
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r11]
            r0.resolve(r1)
            goto L30a
        L1e5:
            return
        L1e6:
            if (r1 == 0) goto L271
            if (r4 == 0) goto L271
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r0 = r0.readyToSolve
            if (r0 == 0) goto L270
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            boolean r0 = r0.readyToSolve
            if (r0 != 0) goto L1f8
            goto L270
        L1f8:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            float r0 = r0.getDimensionRatio()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.start
            int r2 = r2.margin
            int r1 = r1 + r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.targets
            java.lang.Object r2 = r2.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.end
            int r4 = r4.margin
            int r2 = r2 - r4
            if (r14 == r3) goto L24c
            if (r14 == 0) goto L24c
            if (r14 == r11) goto L228
            goto L30a
        L228:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r10
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r11)
            if (r2 == r3) goto L23c
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r10
            int r1 = (int) r1
        L23c:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r3)
            goto L30a
        L24c:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r10
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r11)
            if (r2 == r3) goto L260
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r10
            int r1 = (int) r1
        L260:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r3)
            goto L30a
        L270:
            return
        L271:
            if (r2 == 0) goto L30a
            if (r5 == 0) goto L30a
            boolean r0 = r12.readyToSolve
            if (r0 == 0) goto L2eb
            boolean r0 = r13.readyToSolve
            if (r0 != 0) goto L27e
            goto L2eb
        L27e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            float r0 = r0.getDimensionRatio()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r12.targets
            java.lang.Object r1 = r1.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            int r2 = r12.margin
            int r1 = r1 + r2
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r13.targets
            java.lang.Object r2 = r2.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            int r4 = r13.margin
            int r2 = r2 - r4
            if (r14 == r3) goto L2c8
            if (r14 == 0) goto L2a5
            if (r14 == r11) goto L2c8
            goto L30a
        L2a5:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r11)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r10
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r9)
            if (r2 == r3) goto L2b9
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r10
            int r1 = (int) r1
        L2b9:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r1)
            goto L30a
        L2c8:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r11)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r10
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r9)
            if (r2 == r3) goto L2dc
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r10
            int r1 = (int) r1
        L2dc:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r1)
            goto L30a
        L2eb:
            return
        L2ec:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L30a
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            boolean r1 = r0.resolved
            if (r1 == 0) goto L30a
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            float r1 = r1.mMatchConstraintPercentWidth
            int r0 = r0.value
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r10
            int r0 = (int) r0
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
        L30a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.readyToSolve
            if (r1 == 0) goto L42c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r2 = r1.readyToSolve
            if (r2 != 0) goto L318
            goto L42c
        L318:
            boolean r0 = r0.resolved
            if (r0 == 0) goto L327
            boolean r0 = r1.resolved
            if (r0 == 0) goto L327
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto L327
            return
        L327:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L371
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L371
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            int r1 = r0.mMatchConstraintDefaultWidth
            if (r1 != 0) goto L371
            boolean r0 = r0.isInHorizontalChain()
            if (r0 != 0) goto L371
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.start
            int r3 = r2.margin
            int r0 = r0 + r3
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.end
            int r3 = r3.margin
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.resolve(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r3)
            return
        L371:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L3d5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L3d5
            int r0 = r8.matchConstraintsType
            if (r0 != r11) goto L3d5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 <= 0) goto L3d5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 <= 0) goto L3d5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.start
            int r2 = r2.margin
            int r0 = r0 + r2
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.end
            int r2 = r2.margin
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int r0 = r0.wrapValue
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            int r2 = r1.mMatchConstraintMaxWidth
            int r1 = r1.mMatchConstraintMinWidth
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L3d0
            int r0 = java.lang.Math.min(r2, r0)
        L3d0:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
        L3d5:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L3dc
            return
        L3dc:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r2 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.start
            int r3 = r3.margin
            int r2 = r2 + r3
            int r3 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.end
            int r4 = r4.margin
            int r3 = r3 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.widget
            float r4 = r4.getHorizontalBiasPercent()
            if (r0 != r1) goto L40c
            int r2 = r0.value
            int r3 = r1.value
            r4 = 1056964608(0x3f000000, float:0.5)
        L40c:
            int r3 = r3 - r2
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int r0 = r0.value
            int r3 = r3 - r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            float r1 = (float) r2
            float r1 = r1 + r10
            float r2 = (float) r3
            float r2 = r2 * r4
            float r2 = r2 + r1
            int r1 = (int) r2
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r8.dimension
            int r2 = r2.value
            int r1 = r1 + r2
            r0.resolve(r1)
        L42c:
            return
        L42d:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            r8.updateRunCenter(r1, r0, r9)
            return
    }
}
