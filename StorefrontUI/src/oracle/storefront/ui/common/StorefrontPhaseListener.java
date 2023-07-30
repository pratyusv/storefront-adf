package oracle.storefront.ui.common;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class StorefrontPhaseListener implements PhaseListener {
    private String storedViewId = null;
    public StorefrontPhaseListener() {
    }

    public void afterPhase(PhaseEvent phaseEvent) {
        if (phaseEvent.getPhaseId() == PhaseId.RESTORE_VIEW) {
            storedViewId = phaseEvent.getFacesContext().getViewRoot().getViewId();
        }
    }

    public void beforePhase(PhaseEvent phaseEvent) {
        if (phaseEvent.getPhaseId() == PhaseId.RENDER_RESPONSE) {
            String viewId = phaseEvent.getFacesContext().getViewRoot().getViewId();
            if (storedViewId != null && !viewId.equalsIgnoreCase(storedViewId)) {
                System.out.println("Changing pages");
            }
            storedViewId = null;
        }
    }

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
