package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes2.dex */
public class Metrics {
    public long additionalMeasures;
    public long barrierConnectionResolved;
    public long bfs;
    public long centerConnectionResolved;
    public long chainConnectionResolved;
    public long constraints;
    public long determineGroups;
    public long errors;
    public long extravariables;
    public long fullySolved;
    public long graphOptimizer;
    public long graphSolved;
    public long grouping;
    public long infeasibleDetermineGroups;
    public long iterations;
    public long lastTableSize;
    public long layouts;
    public long linearSolved;
    public long matchConnectionResolved;
    public long maxRows;
    public long maxTableSize;
    public long maxVariables;
    public long measuredMatchWidgets;
    public long measuredWidgets;
    public long measures;
    public long measuresLayoutDuration;
    public long measuresWidgetsDuration;
    public long measuresWrap;
    public long measuresWrapInfeasible;
    public long minimize;
    public long minimizeGoal;
    public long nonresolvedWidgets;
    public long oldresolvedWidgets;
    public long optimize;
    public long pivots;
    public java.util.ArrayList<java.lang.String> problematicLayouts;
    public long resolutions;
    public long resolvedWidgets;
    public long simpleconstraints;
    public long slackvariables;
    public long tableSizeIncrease;
    public long variables;
    public long widgets;

    public Metrics() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.problematicLayouts = r0
            return
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.measures = r0
            r2.widgets = r0
            r2.additionalMeasures = r0
            r2.resolutions = r0
            r2.tableSizeIncrease = r0
            r2.maxTableSize = r0
            r2.lastTableSize = r0
            r2.maxVariables = r0
            r2.maxRows = r0
            r2.minimize = r0
            r2.minimizeGoal = r0
            r2.constraints = r0
            r2.simpleconstraints = r0
            r2.optimize = r0
            r2.iterations = r0
            r2.pivots = r0
            r2.bfs = r0
            r2.variables = r0
            r2.errors = r0
            r2.slackvariables = r0
            r2.extravariables = r0
            r2.fullySolved = r0
            r2.graphOptimizer = r0
            r2.graphSolved = r0
            r2.resolvedWidgets = r0
            r2.oldresolvedWidgets = r0
            r2.nonresolvedWidgets = r0
            r2.centerConnectionResolved = r0
            r2.matchConnectionResolved = r0
            r2.chainConnectionResolved = r0
            r2.barrierConnectionResolved = r0
            java.util.ArrayList<java.lang.String> r0 = r2.problematicLayouts
            r0.clear()
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "\n*** Metrics ***\nmeasures: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.measures
            r0.append(r1)
            java.lang.String r1 = "\nmeasuresWrap: "
            r0.append(r1)
            long r1 = r3.measuresWrap
            r0.append(r1)
            java.lang.String r1 = "\nmeasuresWrapInfeasible: "
            r0.append(r1)
            long r1 = r3.measuresWrapInfeasible
            r0.append(r1)
            java.lang.String r1 = "\ndetermineGroups: "
            r0.append(r1)
            long r1 = r3.determineGroups
            r0.append(r1)
            java.lang.String r1 = "\ninfeasibleDetermineGroups: "
            r0.append(r1)
            long r1 = r3.infeasibleDetermineGroups
            r0.append(r1)
            java.lang.String r1 = "\ngraphOptimizer: "
            r0.append(r1)
            long r1 = r3.graphOptimizer
            r0.append(r1)
            java.lang.String r1 = "\nwidgets: "
            r0.append(r1)
            long r1 = r3.widgets
            r0.append(r1)
            java.lang.String r1 = "\ngraphSolved: "
            r0.append(r1)
            long r1 = r3.graphSolved
            r0.append(r1)
            java.lang.String r1 = "\nlinearSolved: "
            r0.append(r1)
            long r1 = r3.linearSolved
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
