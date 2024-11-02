package com.example.demo.service;

import com.example.demo.model.Vendor;

import java.util.List;
import java.util.Optional;

public interface VendorService {
    List<Vendor> getAllVendors();
    Vendor createVendor(Vendor vendor);
    Optional<Vendor> getVendorById(Long id);
    Vendor updateVendor(Long id, Vendor vendorDetails);
    void deleteVendor(Long id);
}
