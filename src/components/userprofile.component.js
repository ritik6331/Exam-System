import React from "react";
import "./userprofile.component.css";

import { CDropdown, CDropdownToggle, CDropdownMenu, CDropdownItem, CDropdownDivider } from '@coreui/react'
import { FaUserCircle } from "react-icons/fa";

function Userprofile(){
        return(
            <CDropdown variant="btn-group">
            <CDropdownToggle color="white" size="lg"> <FaUserCircle color="#231f20" fontSize="1.9em" /></CDropdownToggle>
            <CDropdownMenu style={{"backgroundColor":"#f7f2f8"}}>
              <CDropdownItem href="/profile">My Profile</CDropdownItem>
              {/* <CDropdownDivider/> */}
              <CDropdownItem href="/rewards" >
                  Rewards
              </CDropdownItem>
              {/* <CDropdownDivider/> */}
              {/* <CDropdownItem href="/login">Logout</CDropdownItem> */}

            </CDropdownMenu>
          </CDropdown>
    );
}

export default Userprofile;