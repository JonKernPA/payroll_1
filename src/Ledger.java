import java.util.ArrayList;
import java.util.List;


public class Ledger {
	
	List<LedgerRecord> records;
	
	public Ledger() {
		records = new ArrayList<LedgerRecord>();
	}

	public List<LedgerRecord> getOutput() {
		return records;
	}

	public void addLedgerRecord(LedgerRecord ledgerRecord) {
		records.add(ledgerRecord);
	}

	
}
