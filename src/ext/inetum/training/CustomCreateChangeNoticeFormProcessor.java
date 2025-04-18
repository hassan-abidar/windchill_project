package ext.inetum.training;

import com.ptc.core.components.beans.ObjectBean;
import com.ptc.core.components.forms.FormProcessingStatus;
import com.ptc.core.components.forms.FormResult;
import com.ptc.core.components.util.FeedbackMessage;
import com.ptc.core.ui.resources.FeedbackType;
import com.ptc.netmarkets.util.beans.NmCommandBean;
import com.ptc.windchill.enterprise.change2.forms.processors.CreateChangeNoticeFormProcessor;
 
import wt.util.WTException;
 
import java.util.List;
import java.util.Locale;


public class CustomCreateChangeNoticeFormProcessor extends CreateChangeNoticeFormProcessor {
    
	@Override
	public FormResult preProcess(NmCommandBean commandBean, List<ObjectBean> objectBean) throws WTException {
		FormResult result = super.preProcess(commandBean, objectBean);
 
 
		if (result.getStatus() == FormProcessingStatus.SUCCESS) {
 
			FeedbackMessage fb = new FeedbackMessage(
					FeedbackType.SUCCESS,
					Locale.getDefault(),
					"Confirmation popup header",
					null,
					"Confirmation popup details");
			result.addFeedbackMessage(fb);
		}
 
		return result;
	}
}

//test