import React from 'react';
import Modal from '../Modal/Modal';

const AddedServices = (props) => {

  function saveSelected(){
    props.setSelectedData(props.details)
    
  }

  function handleChange(e){
    const {name,value} = e.target
    props.setSelectedData((item)=>(
      {
        ...item,
        [name]:value
      }
    )     
    )  
  }
  
  function saveChange(){
    props.setData(
      (prev)=>
        prev.map(
          item=>
            item.id===props.selectedData.id?props.selectedData:item
        )
    )
    props.setSelectedData(null)

  }

  return (
    <>
    <section className="service-card" onClick={saveSelected}>
      <div className="service-details">
        <div><strong>Service:</strong> {props.details.resource}</div>
        <div><strong>Region:</strong> {props.details.region}</div>
        <div><strong>Units:</strong> {props.details.unit}</div>
      </div>
      <button
        className="remove-button"
        onClick={(e)=>
          {
            e.stopPropagation();
            props.handleclick();
          
          }}
        title="Remove this service"
      >
        ×
      </button>
    </section>
    {
      props.selectedData && (
        <>
          <Modal
            onClose={
              ()=> props.setSelectedData(null)

            
            }
          >
              <h2>Edit Service</h2>
              <label htmlFor="resource">Service:
              <input type="text" name='resource' value={props.selectedData.resource} readOnly/>
              </label>
              <label htmlFor="region">Region
              <select name="region" id="region" onChange={handleChange} value={props.selectedData.region} >
                      <option value="">select region</option>
                      <option value="us_west">us-west</option>
                      <option value="af_south">af-south</option>
                      <option value="me_central">me-central</option>
              </select>
              </label>
              <label htmlFor="unit">Unit:
              <input type="number" name='unit' value={props.selectedData.unit} onChange={handleChange}/>
              </label>
              <button onClick={saveChange}>Save</button>
          </Modal>
          
        </>
      )

    }
    </>
  );
};

export default AddedServices;
