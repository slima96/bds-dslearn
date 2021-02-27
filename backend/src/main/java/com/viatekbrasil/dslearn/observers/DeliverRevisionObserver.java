package com.viatekbrasil.dslearn.observers;

import com.viatekbrasil.dslearn.entities.Deliver;

public interface DeliverRevisionObserver {

	void OnSaveRevision(Deliver deliver);
}
