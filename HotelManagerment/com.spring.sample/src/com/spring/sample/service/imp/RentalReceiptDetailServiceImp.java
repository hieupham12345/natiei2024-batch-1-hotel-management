package com.spring.sample.service.imp;

import com.spring.sample.entity.RentalReceiptDetail;
import com.spring.sample.service.RentalReceiptDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalReceiptDetailServiceImp extends BaseServiceImpl implements RentalReceiptDetailService {

    private RentalReceiptDetailServiceImp() {
        // Private constructor to prevent instantiation outside of Spring
    }

    @Override
    public List<RentalReceiptDetail> getAllRentalReceiptDetails() {
        return rentalReceiptDetailDAO.getAllRentalReceiptDetails();
    }

    @Override
    public RentalReceiptDetail getRentalReceiptDetailById(String rentalReceiptID) {
        return rentalReceiptDetailDAO.getRentalReceiptDetailById(rentalReceiptID);
    }

    @Override
    public void saveRentalReceiptDetail(RentalReceiptDetail rentalReceiptDetail) {
        rentalReceiptDetailDAO.saveRentalReceiptDetail(rentalReceiptDetail);
    }

    @Override
    public void deleteRentalReceiptDetail(String rentalReceiptID) {
        rentalReceiptDetailDAO.deleteRentalReceiptDetail(rentalReceiptID);
    }
}
