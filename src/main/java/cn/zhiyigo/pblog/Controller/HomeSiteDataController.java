package cn.zhiyigo.pblog.Controller;

import cn.zhiyigo.pblog.Controller.CommonController.CommonSiteDataController;
import cn.zhiyigo.pblog.Dao.SiteDataDao;
import cn.zhiyigo.pblog.Model.SiteData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/siteData")
public class HomeSiteDataController extends CommonSiteDataController {
    

    @Autowired
    private SiteDataDao siteDataDao;

}
